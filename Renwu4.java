package Shiyan4_2;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out .println("�����ַ���Lixin");
		System.out .print("����������Ե��ַ�");
		Scanner input = new Scanner(System.in);
		char s = input.next().charAt(0);
		if(panduan(s)==true)
		System.out .print("����");
		if(panduan(s)==false)
		System.out .print("������");
		
	}
	public static boolean panduan (char a)
	{
		
		String sModel = "Lixin";
		
		for(int i = 0; i<sModel.length(); i++)
		{
			if((int)a == (int)sModel.charAt(i))
			{
				return true;
			}
		}
		return false;
	}
}
