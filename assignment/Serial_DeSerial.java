package assignment;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Serial_DeSerial {
	public static void main(String[] args) throws IOException {
		Employee emp=new Employee(12,"Siva","CSE","India",16750.34f,"Application");
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try{
			fos=new FileOutputStream("C:/Users/lenovo/Desktop/file2.txt");
			oos=new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Serialization Done!!");
		}
		catch(IOException ioe){System.out.println("io");}
		finally{
			oos.close();
			fos.close();
		}
		Employee e=null;
		try{
			FileInputStream fis=new FileInputStream("C:/Users/lenovo/Desktop/file2.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			e=(Employee)ois.readObject();
			ois.close();
			fis.close();
		}
		catch(IOException ioe){ioe.printStackTrace(); return;}
		catch(ClassNotFoundException cnfe){
			System.out.println("Class is not found");
			cnfe.printStackTrace();
			return;
		}
		System.out.println("Employee id: "+e.getid());
		System.out.println("Employee name: "+e.getname());
		System.out.println("Employee department: "+e.getdepart());
		System.out.println("Employee address: "+e.getaddress());
		System.out.println("Employee salary: "+e.getsalary());
		System.out.println("Employee project name: "+e.getproject_name());
	}
}
class Employee implements java.io.Serializable{
	private int id;
	private String name;
	private String depart;
	private String address;
	private float salary;
	private String project_name;
	public Employee(int id, String name, String depart, String address, float salary, String project_name) {
		this.id=id;
		this.name=name;
		this.depart=depart;
		this.address=address;
		this.salary=salary;
		this.project_name=project_name;
	}
	public int getid(){return id;}
	public void setid(int id){this.id=id;}
	public String getname(){return name;}
	public void setname(String name){this.name=name;}
	public String getdepart(){return depart;}
	public void setdepart(String depart){this.depart=depart;}
	public String getaddress(){return address;}
	public void setaddress(String address){this.address=address;}
	public float getsalary(){return salary;}
	public void setsalary(float salary){this.salary=salary;}
	public String getproject_name(){return project_name;}
	public void setproject_name(String project_name){this.project_name=project_name;}
}