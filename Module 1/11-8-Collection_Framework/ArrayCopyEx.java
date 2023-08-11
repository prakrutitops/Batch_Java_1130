package com.collection1;

public class ArrayCopyEx 
{
	public static void main(String[] args) {
		
		int A[] = {1,2,3,4,5};
		
		int B[] = new int[10];
		
		System.arraycopy(A,2,B,3,2);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(B[i]);
		}
		
		
		
	}
}
