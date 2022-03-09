package assisted_practice;
public abstract class Abstraction {
	abstract void run();
	abstract void stop();
	int speed;
	long distance;
	Abstraction(){
		speed=0;
		distance=0;
	}
	public static class Two_wheeler extends Abstraction{
		Two_wheeler(){
			int speed=34;
			long distance=987;
			int num_of_tire=2;
		}
		int num_of_tire=2;
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
	public static void main(String[] args) {
		Abstraction ab=new Two_wheeler();
		ab.run();
		ab.stop();
	}
}
