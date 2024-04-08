package logical_que;

import java.util.Arrays;

public class Switchallzerotorightandleft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,0,5,0,9};
		
		int len = arr.length;
		int index_num =0;
		int modify_arr[] = new int[len];
		
		for(int ele: arr) {
			if(ele!=0) {
				modify_arr[index_num]=ele;
				index_num++;
			}
		}
		
		System.out.println(Arrays.toString(modify_arr));
		
		//for reversing
		
		String rev = "";
		String str = Arrays.toString(modify_arr);
		for(int i=str.length()-2;i>0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
