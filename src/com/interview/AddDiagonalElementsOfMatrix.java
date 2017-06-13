package com.interview;

public class AddDiagonalElementsOfMatrix {

	
	public static void main(String[] args) {
		int sum=0;
		int[] a[]=new int[3][3];
	
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j]=i*j;
				System.out.print(a[i][j]+" ");
				if(j==2)
					System.out.println();
			}
		}
		for(int i=0;i<a.length;i++){
			
					int k=i;
					
					while(0<k){
					System.out.print("  ");
					k--;
					}
					System.out.print(a[i][i]);
					System.out.println();
					sum+=a[i][i];
		}
			
		
		System.out.println(sum);

	}

}
