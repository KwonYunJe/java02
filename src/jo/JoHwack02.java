package jo;

public class JoHwack02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 88;
		
		System.out.println("Your score is " + score);
		
		if (score >= 90) {
			System.out.println("Your grade is A");
		}else if(score < 90 && score >= 80) {
			System.out.println("Your grade is B");
		}else if(score < 80 && score >= 70) {
			System.out.println("Your grade is C");
		}else if(score < 70 && score >= 60) {
			System.out.println("Your grade is D");
		}else{
			System.out.println("Your grade is F");
		}
	}

}
