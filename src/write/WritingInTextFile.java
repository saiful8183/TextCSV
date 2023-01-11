package write;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingInTextFile {

	public static void main(String[] args) throws IOException {

//                     Using (File,FileWriter,BufferedWriter)
//		
//		File src=new File("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties");
//		
//		FileWriter fw=new  FileWriter(src,false);  // To print more then one use (true)
//		BufferedWriter writer=new BufferedWriter(fw);
//		
//		writer.write("First Line");
//		writer.newLine();
//		writer.write("Second Line");
//		writer.newLine();
//		writer.write("Third Line");
//		writer.newLine();
//	    writer.write("I love you");
//		writer.newLine();
//		writer.write("I hate you");
//		writer.newLine();
//		writer.write("Neither hate nor love");
//		writer.newLine();
//		
//		
//		System.out.println("Hurrah file got created");
//		
//		writer.close();
//		
//		

		
		  File file=new
		  File("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties"
		  );
		  
		  FileWriter writer=new FileWriter(file,false); 
		  BufferedWriter buffered= new BufferedWriter(writer);
		  
		  buffered.write("I love Manha"); 
		  buffered.newLine();
		  
		  
		  buffered.write("I love Nabeeha"); 
		  buffered.newLine();
		  
		  
		  
		  buffered.write("I love Nameera "); 
		  buffered.newLine();
		  
		  buffered.close(); System.out.println("The file gott created");
		 
	}

}
