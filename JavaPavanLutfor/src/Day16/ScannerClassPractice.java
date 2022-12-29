package Day16;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		
		//1.int
//		Scanner sc=new Scanner(System.in);
//		int x;
//		System.out.println("Enter a value for x:");
//		x=sc.nextInt();
//		System.out.println("x=" +x);
//		sc.close();
		
		// 2.String
		Scanner str=new Scanner(System.in);
		//String a;
		System.out.println("Enter your String for a");
		String a=str.nextLine();//next()for single word
		System.out.println("print a value for string:"+a);

	}//Main

}//Class
	