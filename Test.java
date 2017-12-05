package shiyan3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		float Num = input.nextFloat();
		if(Num<0 && Math.abs(Num)<10000000 && Math.abs(Num)>1)
		{
			System.out.print("fu");
		}
		if(Num>0 && Math.abs(Num)<10000000 && Math.abs(Num)>1)
		{
			System.out.print("zheng");
		}
		if(Num<0 && Math.abs(Num)>10000000)
		{
			System.out.print("dafu");
		}
		if(Num>0 && Math.abs(Num)>10000000)
		{
			System.out.print("dazheng");
		}
		}
		
		
	}


