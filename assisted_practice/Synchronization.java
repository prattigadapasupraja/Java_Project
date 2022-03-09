package assisted_practice;
public class Synchronization 
{
    public static void main(String args[]) throws InterruptedException
    {
        First fnew = new First();
        Second ss = new Second(fnew, "synchronized");
        Second ss1= new Second(fnew,"new");
        Second ss2 = new Second(fnew, "normal");
    }
}
class First
{
  public void display(String msg) throws InterruptedException
  {
    System.out.println("This is without "+msg+" program");
    Thread.sleep(1000);
  }
  synchronized public void display1(String msg) throws InterruptedException
  {
	Thread.sleep(1000);
    System.out.println("This is "+msg+" program");
   }
}
class Second extends Thread{
	String msg;
	First f;
	Second (First fp,String str)
	  {
	    f = fp;
	    msg = str;
	    start();
	  }
	public void run()
	{
		try {
			f.display(msg);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			f.display1(msg);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
