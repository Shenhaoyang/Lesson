package shiyan3;

import java.util.Scanner;

public class Renwu3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("����ֵ");
		float a = input.nextFloat();
		if (a<0)
		{
			if (Math.abs(a)<1)
			{
				System.out.print("С����");
			}
			else if (Math.abs(a)>1000000)
			{
				System.out.print("����");
			}
			else {System.out.print("����");}	
				
		}
		else if (a>0)
		{
			if (Math.abs(a)<1)
			{
				System.out.print("С����");
			}
			else if (Math.abs(a)>1000000)
			{
				System.out.print("������");
			}
			else {System.out.print("����");}		
		}
		else 
		{
			System.out.print((int)a);
		}
		
	}

}
