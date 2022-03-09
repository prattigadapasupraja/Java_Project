package assisted_practice;
import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.*;
public class File_Operations {
	@SuppressWarnings("resource")
	static void modifyFile(String filePath, String oldString, String newString) throws IOException
    {
    File fileToBeModified = new File(filePath);
    String oldContent = "";
    BufferedReader reader = null;
    FileWriter writer = null;
    reader = new BufferedReader(new FileReader(fileToBeModified));
    String line = reader.readLine();
    while (line != null) 
    {
        oldContent = oldContent + line + System.lineSeparator();
        line = reader.readLine();
    }
    String newContent = oldContent.replaceAll(oldString, newString);
    writer = new FileWriter(fileToBeModified);
    writer.write(newContent);
    }
	public static void main(String[] args) throws IOException {
        File file = new File("C:/Users/lenovo/Desktop/file1.txt");
        if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
        FileWriter writer1 = new FileWriter(file);
        writer1.write("Test data");
        writer1.close();
        Scanner dataReader=new Scanner(file);
        while(dataReader.hasNextLine()){
        	String filedata=dataReader.nextLine();
        	System.out.println(filedata);
        }
        dataReader.close();
        modifyFile("C:/Users/lenovo/Desktop/file1.txt", "85", "95");
        System.out.println("done");
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("C:/Users/lenovo/Desktop/file2.txt");
        out.write(data.getBytes());
        out.close();
        try{
        	Files.deleteIfExists(Paths.get("C:/Users/lenovo/Desktop/file2.txt")); 
        }
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 
          
        System.out.println("Deletion successful."); 

	}
}