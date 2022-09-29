package soon;

import java.util.Scanner;

public class SoonHwack02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name?");
		String name = sc.next();
		System.out.println("height?");
		Double height = sc.nextDouble();
		System.out.println("weight?");		
		Double weight = sc.nextDouble();
		System.out.println("dinner?");		
		boolean dinner = sc.nextBoolean();
		sc.nextLine();
		System.out.println("JwaWoo?");		
		String jwawoo = sc.nextLine();
		
		System.out.println("My name is " + name);
		System.out.println("My next year heigth is " + (height+11));
		System.out.println("My next year weight is " + (weight-10));
		System.out.println("I have dinner is " + dinner);
		System.out.println("My JwaWoo is " + jwawoo);
	}

}
