package jo;

import java.util.Date;

public class SwitchCaseTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		int month = date.getMonth() +1;
		int day = date.getDay();
		switch (day) {
		case 0: case 6:
			System.out.println("놀자.");
			break;

		default:
			System.out.println("Lets go study java");
			break;
		}
	}

}
