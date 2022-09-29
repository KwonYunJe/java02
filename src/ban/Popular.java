package ban;

import java.util.Scanner;

public class Popular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int iu = 0;
		int yu = 0;
		int bts = 0;
		
		for(int i = 0 ; i <10 ; i++ ) {
			System.out.print("입력 (1)아이유 (2)유재석 (3)BTS (4)종료 : ");
			sel = sc.nextInt();
			if(sel == 1 ) {
				iu++;
			}else if(sel == 2) {
				yu++;
			}else if(sel ==3){
				bts++;
			}else if(sel == 4) {
				System.out.println("아이유 : " + iu);
				System.out.println("유재석 : " + yu);
				System.out.println("BTS : " + bts);
				System.out.println("프로그램을 조기종료합니다.");
			}
			else {
				System.out.println("없는 번호입니다.");
				i--;
			}
			sel = 0;
		}
		System.out.println("아이유 : " + iu);
		System.out.println("유재석 : " + yu);
		System.out.println("BTS : " + bts);
		
	}

}
