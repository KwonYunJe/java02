package ban;

import java.util.Scanner;

public class BanHwack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		String con = " ";
		
		for(int i = 0 ; i < 1 ; i++ ) {
			System.out.print("Enter num.1 : ");
			a = sc.nextInt();
			System.out.print("Enter num.2 : ");
			b = sc.nextInt();
			
			if( a > b ) {
				System.out.println("Num1 > Num2");
			}else {
				System.out.println("Num1 < Num2");
			}
			System.out.println("Continue? (y/n)");
			con = sc.next();
			if(con.equals("y")) {
				i--;
			}else {
				System.out.println("Exit program");
			}
			
		}
		}
		
		

}
