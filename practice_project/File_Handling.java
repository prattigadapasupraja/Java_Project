package practice_project;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_Handling {
	public static void appendStr(File f,String str) throws IOException{
		BufferedWriter out=new BufferedWriter(new FileWriter(f,true));
		out.write(str);
		out.close();
}
	public static void main(String[] args)
	{
		try {
			File f=new File("C:/Users/lenovo/Desktop/file1.txt");
			FileReader fr = new FileReader("C:/Users/lenovo/Desktop/file1.txt");			
			FileWriter fw = new FileWriter("C:/Users/lenovo/Desktop/file1.txt");			
			String str = "This is File Handling Program";
			int i;		
			while ((i = fr.read()) != -1) {			
				str += (char)i;
			}
			System.out.println(str);
			fw.write(str);
			String str1=" and appended the file";
	        appendStr(f,str1);
	        Scanner dataReader=new Scanner(f);
	        while(dataReader.hasNextLine()){
	        	String filedata=dataReader.nextLine();
	        	System.out.println(filedata);
	        }
	        dataReader.close();
			fr.close();
			fw.close();
			System.out.println("File reading and writing both done");
		}
		catch (IOException e) {		
			System.out.println("There are some IOException");
		}
	}
}
