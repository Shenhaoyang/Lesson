package shiyan3;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		
			int year;
			System.out.println("���������:");
			Scanner input=new Scanner(System.in); 
			year=input.nextInt(); 
			if(year%4==0&&year%100!=0||year%400==0)
			{
			System.out.println("������");
			}
			else
			{
			System.out.println("��������");
			}
	}

}
