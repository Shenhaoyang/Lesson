package shiyan3_2;

import java.util.Scanner;

public class Renwu3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
			boolean flag = true;
			Scanner input = new Scanner(System.in);
			System.out.print("����һ����");
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
				System.out.println(num+"������");
			}
			else
			{
				System.out.println(num+"��������");
			}
	}

}
