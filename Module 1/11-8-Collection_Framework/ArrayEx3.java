package com.collection1;

public class ArrayEx3 
{
	public static void main(String[] args) {
		
		
		int data [][] = {{1,2,3},{4,5,6},{7,8,9}};
	
		
		for(int i=0;i<3;i++)
		{
			for(int j =0;j<3;j++)
			{
				System.out.println("index of ["+i+"]+["+j+"] = " + data[i][j]);
			}
			
			
		}
		
		
	}
}
