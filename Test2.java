package shiyan3_2;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		int L = input.nextInt();
		for(int i=1; i<=(2*L-1); i++)    
		{
			if(L>26||L<1)
			{
				System.out.println("输入错误");
				break;
			}
			for (int k = 0; k<Math.abs(i-L); k++)
			{
			System.out.print(" ");
			}
			char a = 64;
			if(i<=L)
			{	
				int j = 1;			
				for(; j<=Math.abs(i); j++)			
				{				
				System.out.print((char)(a+j));				
				}
				if((char)(a+j)==65+i&&(char)(a+j)!='B')
				{
					char A = (char) (a+j);
					int B = 2;
					do {
						System.out.print((char)(A-B));
						B++;
						}
					while((int)(A-B)>=65);	
				}
			}
			char b = 64;
			if(i>L)
			{
				int k = L-1;	
				int C = 1;
				for(; k>=Math.abs(i-L); k--)
				{
				
				System.out.print((char)(b+C));
				C++;
				}
				if((char)(b+C)==(65+L-(i-L))&&(char)(b+C)!='B')
				{
					char A = (char) (b+C);
					int B = 2;
					do {
						System.out.print((char)(A-B));
						B++;
					}
					while((int)(A-B)>=65);
				}
			}
			
			System.out.println();
			
		}

		
	}

}
