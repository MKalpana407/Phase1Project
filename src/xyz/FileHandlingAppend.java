package xyz;


import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingAppend {
	public static void main(String[] args)
	{
		String data=" This data is appended.....";
		try
		
		{
			FileWriter output = new FileWriter("data11.txt",true);
			output.write(data);
			System.out.println("Data Append successfully");
			output.close();
		}
		catch(IOException ex)
		{
			System.out.println("File append error");
		}
	}

}


