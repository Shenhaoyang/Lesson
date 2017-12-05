package shiyan3;

import java.util.Scanner;

public class Renwu3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("输入值");
		float a = input.nextFloat();
		if (a<0)
		{
			if (Math.abs(a)<1)
			{
				System.out.print("小负数");
			}
			else if (Math.abs(a)>1000000)
			{
				System.out.print("大负数");
			}
			else {System.out.print("负数");}	
				
		}
		else if (a>0)
		{
			if (Math.abs(a)<1)
			{
				System.out.print("小正数");
			}
			else if (Math.abs(a)>1000000)
			{
				System.out.print("大正数");
			}
			else {System.out.print("正数");}		
		}
		else 
		{
			System.out.print((int)a);
		}
		
	}

}
