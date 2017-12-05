package Shiyan4_1;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("输入你想搜索的数");
		int a = input.nextInt();
		int iArr[]= {1,2,3,4,5,6,7,8,9,10};
	     for(int i=0;i<iArr.length;i++)
	     {
	    	 if(a == iArr[i])
	    	 {
	    		 System.out.print("这个数字在数组中的索引是："+i);
	    		 return;
	    	 }
	    	 
	     }
	     System.out.print("这个数字不在数组内");
	}

}
