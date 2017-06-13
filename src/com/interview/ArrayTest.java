package com.interview;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count=0,ano=0;
		int a[][][] = new int[6][5][10];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<10;k++){
					a[i][j][k]=a[i][j][k]+1;
							
					count++;
				}
				
			}
		}
		System.out.println(count);
		for(int b[][] :a){
			for(int c[] :b){
				for(int d:c){
					System.out.println(d);
					ano++;
				}
			}
		}
		System.out.println(ano);
	}

}
