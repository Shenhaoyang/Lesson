package Shiyan4_2;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out .println("给定字符串Lixin");
		System.out .print("输入你想测试的字符");
		Scanner input = new Scanner(System.in);
		char s = input.next().charAt(0);
		if(panduan(s)==true)
		System.out .print("包含");
		if(panduan(s)==false)
		System.out .print("不包含");
		
	}
	public static boolean panduan (char a)
	{
		
		String sModel = "Lixin";
		
		for(int i = 0; i<sModel.length(); i++)
		{
			if((int)a == (int)sModel.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}
