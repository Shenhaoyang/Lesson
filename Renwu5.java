package Shiyan2;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int A = sc.nextInt();    //输入数字123456
		int a = A/100000;       //取到1
		int b = A/10000%10;		//   取到2
		int c = A/1000%10;		//取到3
		int d = A/100%10;		//取到4
		int e = A/10%10;		//取到5
		int f = A%10;			//取到6
		System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		
	}

}
