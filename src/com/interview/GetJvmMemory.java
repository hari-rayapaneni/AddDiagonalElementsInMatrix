package com.interview;

public class GetJvmMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Runtime r=Runtime.getRuntime();
		//int mb=1024*1024;
		System.out.println(r.availableProcessors());
		System.out.println(r.freeMemory());

	}

}
