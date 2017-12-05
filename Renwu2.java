package shiyan3;

import java.util.Scanner;

public class Renwu2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		System.out.print("输入第一个数");
		int Max;
		int a = input.nextInt();
		System.out.print("输入第二个数");
		int b = input.nextInt();
		//对a，b进行比较
		if (a>b)
		{
			Max = a;
		}
		else
		{
			Max = b;
		}
		System.out.print("输入第三个数");
		int c = input.nextInt();
		//比较Max与c
		if (Max>c)
		{
			System.out.print("最大值是"+Max);
		}
		else
		{
			Max = c;
			System.out.print("最大值是"+Max);
		}
		
	}

}
