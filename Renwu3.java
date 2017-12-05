package shiyan3_2;

import java.util.Scanner;

public class Renwu3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
			boolean flag = true;
			Scanner input = new Scanner(System.in);
			System.out.print("输入一个数");
			int num = input.nextInt();
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					flag = false;
				
				}
			}
			if(flag)
			{
				System.out.println(num+"是素数");
			}
			else
			{
				System.out.println(num+"不是素数");
			}
	}

}
