package assignment;
public abstract class Vehicle {
	abstract void run();
	abstract void stop();
	public void fuel(int a){}
	public void fuel(float a,String b){}
	public void fuel(char  a,int b){}
	int speed;
	long distance;
	Vehicle(){speed=0;distance=0L;}
	Vehicle(int speed,long distance){this.speed=speed;this.distance=distance;}
	public static class Two_wheeler extends Vehicle{
		int num_of_tire=2;
		Two_wheeler(){
			int speed=34;
			long distance=987;
			int num_of_tire=2;
		}
		void display(){
			System.out.println("speed of the Vehicle"+super.speed);
			System.out.println("Distance of the Vehicle"+super.distance);
			System.out.println("Number of tires="+num_of_tire);
		}
		void run() {
			System.out.println("Run method of two wheeler");
		}
		void stop() {
			System.out.println("Stop method of two wheeler");
		}
		
	}
	public static class Three_wheeler extends Vehicle{
		int num_of_tire=3;

		Three_wheeler(){
			int speed=78;
			long distance=977;
			int num_of_tire=3;
		}
		void display(){
			System.out.println("speed of the Vehicle"+super.speed);
			System.out.println("Distance of the Vehicle"+super.distance);
			System.out.println("Number of tires="+num_of_tire);
		}
		void run() {
			System.out.println("Run method of three wheeler");
		}
		void stop() {
			System.out.println("Stop method of three wheeler");
		}
		
	}
	public static class  Four_wheeler extends Vehicle{
		int num_of_tire=4;

		Four_wheeler(){
			int speed=50;
			long distance=987;
			int num_of_tire=4;
		}
		void display(){
			System.out.println("speed of the Vehicle"+super.speed);
			System.out.println("Distance of the Vehicle"+super.distance);
			System.out.println("Number of tires="+num_of_tire);
		}
		void run() {
			System.out.println("Run method of four wheeler");
		}
		void stop() {
			System.out.println("Stop method of four wheeler");
		}
		
	}
	public static class Eigth_wheeler extends Vehicle{
		int num_of_tire=8;

		Eigth_wheeler(){
			int speed=45;
			long distance=4565;
			int num_of_tire=8;
		}
		void display(){
			System.out.println("speed of the Vehicle"+super.speed);
			System.out.println("Distance of the Vehicle"+super.distance);
			System.out.println("Number of tires="+num_of_tire);
		}
		void run() {
			System.out.println("Run method of eigth wheeler");
		}
		void stop() {
			System.out.println("Stop method of eigth wheeler");
		}	
	}
	public static void main(String[] args){
		Vehicle v1=new Two_wheeler();
		Vehicle v2=new Three_wheeler();
		Vehicle v3=new Four_wheeler();
		Vehicle v4=new Eigth_wheeler();
		v1.run();
		v1.stop();
		v2.run();
		v2.stop();
		v3.run();
		v3.stop();
		v4.run();
		v4.stop();
	}
}
