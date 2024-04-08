package logical_que;

public class SameElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr1 [] = {"java","python","php","c#","c++"};
		String arr2 [] = {"sql","mysql","c#","oracle","java"};
		
		
		for(String ele: arr1) {
			
			for(String var: arr2) {
				
				if(ele.equals(var)) {
					System.out.println(ele);
				}
			}
		}

	}

}
