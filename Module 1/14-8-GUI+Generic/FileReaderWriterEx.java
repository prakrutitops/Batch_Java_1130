package com.a148;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx 
{
	public static void main(String[] args) throws IOException 
	{
		
		FileWriter write = new FileWriter("E://b.txt");
		String s = "Hello , this is my data";
		write.write(s);
		write.flush();
		write.close();
		
		
		FileReader f = new FileReader("E://b.txt");
		int i=0;
		
		while((i=f.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
}
