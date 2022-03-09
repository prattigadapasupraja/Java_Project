package assisted_practice;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Read_Write_Append {
	public static void appendStr(File f,String str) throws IOException{
			BufferedWriter out=new BufferedWriter(new FileWriter(f,true));
			out.write(str);
			out.close();
	}
	public static void main(String[] args) throws IOException {
		File f=new File("C:/Users/lenovo/Desktop/file1.txt");
		FileWriter writer1 = new FileWriter(f);
        writer1.write("the way to write a file");
        writer1.close();
        String str=" and appended the file";
        appendStr(f,str);
        Scanner dataReader=new Scanner(f);
        while(dataReader.hasNextLine()){
        	String filedata=dataReader.nextLine();
        	System.out.println(filedata);
        }
        dataReader.close();
	}
}
