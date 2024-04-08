package logical_que;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//17 is a prime or not
		
		int num =16;
		int rem;
		int flag =0;
		for(int i=2;i<num;i++) {
			
			rem = num%i;
			if(rem==0) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println("number is not a prime");
		}else {
			System.out.println("number is prime");
		}

	}

}
