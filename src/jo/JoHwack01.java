package jo;

import java.util.Scanner;

public class JoHwack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ppw = "pass";
		Scanner scan = new Scanner(System.in);
		System.out.print("Password : ");
		String pw = scan.next();
		
		if(pw.equals(ppw) == true) {
			System.out.println("Come in");
		}else {
			System.out.println("Get out");
		}
	}

}
