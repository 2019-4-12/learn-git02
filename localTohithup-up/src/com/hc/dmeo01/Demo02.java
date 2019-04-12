package com.hc.dmeo01;

/**
 *  打印几行
 * @author Administrator
 *
 */
public class Demo02 {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ^ ");
			}
			System.out.println();
		}
		
	}

}
