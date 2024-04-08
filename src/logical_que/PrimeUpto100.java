package logical_que;

public class PrimeUpto100 {

	public static void main(String[] args) {
		
		int flag = 0;
		for(int i=1;i<=100;i++) {
			
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					flag=flag+1;
				}
			}
			if(flag==0) {
				System.out.println(i);
			}else {
				flag=0;
			}
			
		}

	}

}
