package logical_que;

public class Regex_variation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "sh@123*&% ravan";
		
		String result = name.replaceAll("[^a-zA-Z|]", "");
		
		System.out.println(result);
		
		StringBuffer sb = new StringBuffer(result);
		System.out.println(sb.reverse());
		
		StringBuilder sb1 = new StringBuilder(result);
		StringBuilder var = sb1.reverse();
		System.out.println(var);
		
		//Without regex
		
		StringBuilder sb2 = new StringBuilder();
		
		int len = name.length();
		System.out.println(len);
		System.out.println(sb2);
		String str = "";
		for(int i=0;i<len;i++) {
			
			
			char ch = name.charAt(i);
			if(Character.isLetter(ch)) {
				sb2.append(ch);
			}
		}
		
		System.out.println(sb2);
		
		

	}

}
