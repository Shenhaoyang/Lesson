package shiyan3_2;

import java.util.Scanner;

public class Renwu8 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("��������Ҫ������");
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
