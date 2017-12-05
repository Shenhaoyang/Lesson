package shiyan3_2;

import java.util.Scanner;

public class Renwu8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("输入你想要的行数");
		int LineNum = input.nextInt();								
		int Linenum = LineNum;
		
		for(int j=LineNum;j>0;j--)
		{	
			
			for(int i =LineNum--;i>0;i--)
			{
				System.out.print("*");
				
			}
			System.out.println();
			for(int k = 0; k<=Linenum-j; k++)
			{
				System.out.print(" ");
			}
			
		}
		
	}

}
