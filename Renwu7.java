package Shiyan2;

import java.util.Scanner;

public class Renwu7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		System.out.print("输入0到1000之间的整数：");
		int a = sc.nextInt();		//输入数字
		int g,s,b;
		g=a%10;					//取个位数（取余）
		s=(a%100)/10;			//取十位数（取余得65在除以10取整）
		b=a/100;				//取百位数（除以100取整）
		System.out.print("输入数字中所有数字的总和为："+(g+s+b));
	}

}
