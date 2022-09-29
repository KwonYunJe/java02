package ban;

import java.util.Random;

import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random r = new Random();
		int target = 88;
		int count = 0;
		int wcount = 0;
		
		while (true) {
			String data = JOptionPane.showInputDialog("Enter random one");
			int data2 = Integer.parseInt(data);
			count ++;
			if (data2 == target) {
				System.out.println("Right!");
				
				break ;
			} else {
				wcount ++;
				System.out.println("Worng!");
				if(data2 > target) {
					System.out.println("Input data > Target");
				}else {
					System.out.println("Input data < Target");
					
				}
			} 
			
		}
		System.out.println("Total Count : " + count);
		System.out.println("Wrong Count : " + wcount);
		//JOptionPane.showMessageDialog(null, "See you next time");
	}

}
