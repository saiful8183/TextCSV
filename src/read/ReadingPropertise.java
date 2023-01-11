package read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class ReadingPropertise {

	public static void main(String[] args) throws IOException{
	
		
		 
//	                First approch(Using Properties & FileInputStream )
	//	==================================================================================
		
//		Properties prop=new Properties();
//		
//		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\read\\Config.properties");	
//		
//		prop.load(fis);
//		
//		System.out.println(prop.getProperty("name"));
//		System.out.println(prop.getProperty("age"));
//		System.out.println(prop.getProperty("project"));
//		
//		
//		
		
		
//		               Second Approch(Using Scanner & File)
		//=======================================================================================
		
//		
//		File file=new File("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties");
//		
//		Scanner sc=new Scanner(file);
//		
//		while(sc.hasNextLine()) {
//		
//		System.out.println(sc.nextLine());
//		
//		}
		
		
		
		
		//              Third approch(Using FileReader &BufferReader)
		//========================================================================================
		
//		
//		FileReader fr=new FileReader("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties");
//		BufferedReader br=new BufferedReader(fr);
//		
//		String str;
//		
//		while((str=br.readLine())!= null)
//		{
//			
//			System.out.println(str);
//		}
//		
//		br.close();
//		
		
		//                       Fourth Approch (Using Scanner & File)
		//===========================================================================
		
		
		
//		File file=new File("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties");
//		
//		Scanner sc=new Scanner(file);
//		sc.useDelimiter("\\z");
//		System.out.println(sc.next());
		
		
		
		
	                          	// Second Approch(Using Scanner & File)
		
		//======================================================================================
		
		
		File file=new File("C:\\Users\\Saiful Chowdhury\\eclipse-workspace\\ReadingWritingTextCsv\\src\\read\\Config.properties");
		
		Scanner sc=new Scanner(file);
		
		while(sc.hasNextLine()) {
		
		System.out.println(sc.nextLine());
		
		}
		
		
   }

  }
