package ban;

public class ForProblem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		
		for(int i =1; i<=1000; i=i+3) {
			
			if(sum > 100) {
				break;
			}
			else {
				if(i%5==0) {
					i=i+3;
				}
				else {
					sum=sum+i;
				}
			}
		}
		
		System.out.println(sum);
	}

}
