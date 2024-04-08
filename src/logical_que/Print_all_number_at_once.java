package logical_que;

public class Print_all_number_at_once {
	
	//Java code to print "9876534432" as output when input is "+1 (234) -435-6789"

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  num = "+1 (234) -435-6789";
		
		String result = num.replaceAll("[^2-9]", "");
		//[a-zA-Z0-9]
		
		System.out.println(result);
		
		StringBuilder sb = new StringBuilder(result);
		
		System.out.println(sb.reverse());
		
		
		
	}

}
