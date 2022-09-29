package soon;

import java.util.Scanner;

public class SoonHwack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Hobby");
		String hobby = sc.next();
		
		System.out.println("My name is " + name);
		System.out.println("My age is " + age);
		System.out.println("My hobby is " + hobby);
	}

}
