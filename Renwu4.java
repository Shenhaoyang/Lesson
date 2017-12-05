package Shiyan2;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1st integer:");
		int a=sc.nextInt();							//输入第一个数字
		System.out.println("Input 2st integer:");
		int b=sc.nextInt();							//输入第二个数字
		System.out.println("Sum of two integers: "+(a+b));			//两个整数的和：30
		System.out.println("Difference of two integers: "+(a-b));	//两个整数的差：20	
		System.out.println("Product of two integers: "+(a*b));		//两个整数的乘积：125
		System.out.println("Average of two integers: "+((a+b)/2));	//两个整数的平均数：15
		System.out.println("Distance of two integers: "+Math.abs(a-b));		//两个整数的距离：20
		System.out.println("Max integer: "+((a>b)?a:b));			//最大整数：25
		System.out.println("Min integer: "+((a<b)?a:b));			//最小整数：5

		
		
	}

}
