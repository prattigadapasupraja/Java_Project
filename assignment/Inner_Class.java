package assignment;
class MotherBoard{
	static class USB{
		int usb2=2;
		int usb3=1;
		int gettotalports(){
			return usb2+usb3;
		}
		static void display(){
			System.out.println("we are into the static method of Inner class");
		}
	}
}
public class Inner_Class {
	public static void main(String[] args) {
		MotherBoard.USB usb=new MotherBoard.USB();
		System.out.println("Total Ports= "+usb.gettotalports());
		MotherBoard.USB.display();
	}
}
