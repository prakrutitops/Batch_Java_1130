package com.a148;

import java.io.File;
import java.io.IOException;

public class FileEx 
{
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("E://a.txt");
		
		file1.createNewFile();
		
		System.out.println(file1.exists());;
		System.out.println(file1.isDirectory());;
		System.out.println(file1.lastModified());;
		System.out.println(file1.getName());;
		System.out.println(file1.getAbsolutePath());;
		System.out.println(file1.getPath());;
		System.out.println(file1.canExecute());;
		System.out.println(file1.canRead());;
		
	}
}
