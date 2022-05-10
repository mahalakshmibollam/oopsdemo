package fileio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//Writer class is used to write String/text data in to a text file
public class WriterExample {

	public static void main(String[] args) {

		try {
			
			Writer w=new FileWriter("c:/demo/data.txt");

			String content="She Sells Sea Shells in  the Sea. Programming by Maha";
			w.write(content);
			w.close();
			System.out.println("Data Writen to file");


		}
		catch(IOException e)
		{
			System.err.println("Error Occured");
			e.printStackTrace();
		}
	}
}
