package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		boolean leapYear = x % 4 == 0 && x % 100 != 0 || x % 400 ==0;
		
		
		System.out.println(leapYear );
		
		

	
		
		// TODO Auto-generated method stub

	}

}
