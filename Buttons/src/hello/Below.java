package hello;
import java.io.CharArrayWriter;
//import java.io.FileReader;
import java.io.FileWriter;
public class Below
{
	public static void main(String[] args)throws Exception
	{


			CharArrayWriter out = new CharArrayWriter();
			CharArrayWriter out1 = new CharArrayWriter();
			out.write("FARHAN");
			out1.write("HASU");
			
//			String fileName;
			FileWriter f1=new FileWriter("D:\\had.txt");
			FileWriter f2=new FileWriter("D:\\dad.txt");
			
			out.writeTo(f1);
			out1.writeTo(f2);
			
			System.out.println("successful");
			f1.close();
			f2.close();

		}

	}

		
	
