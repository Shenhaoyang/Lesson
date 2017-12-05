package Shiyan2;

import java.util.Scanner;

public class Renwu6 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		int M,Y,D;
		System.out.print("输入分钟数：");
		M=sc.nextInt();
		Y=M/60/24/365;		//取整求年数
		D=(M/60/24)%365;	//先取整求得天数为2400天，再取余
		System.out.print("大约为"+Y+"年"+D+"天");
	}

}
