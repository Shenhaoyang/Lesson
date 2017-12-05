package shiyan3_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		for(int i=1; i<=13; i++)
		{
			for (int k = 0; k<Math.abs(i-7); k++)
			{
			System.out.print(" ");
			}
			char b = 72;
			for(int k = 7; k>Math.abs(i-7); k--)
			{				
				System.out.print((char)(b-k));
				if((char)(b-k)==64+i&&(int)(b-k)!=65)
				{
					do {
						System.out.print("1");
						k++;
					}
					while( (int)(b-k) ==65);
				}
			}
		System.out.println("");
		}
		
		
		}
	}


