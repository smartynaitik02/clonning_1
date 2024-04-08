package logical_que;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		
		int sum=1;
		
		for(int i=1;i<=num;i++) {
			
			sum = i*sum; //1*1//2*1//3*2//6*4//
			//6 5 4 3 2 1 
			
		}
		System.out.println(sum);

	}

}
