package shiyan3;

import java.util.Scanner;

public class Renwu2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		System.out.print("�����һ����");
		int Max;
		int a = input.nextInt();
		System.out.print("����ڶ�����");
		int b = input.nextInt();
		//��a��b���бȽ�
		if (a>b)
		{
			Max = a;
		}
		else
		{
			Max = b;
		}
		System.out.print("�����������");
		int c = input.nextInt();
		//�Ƚ�Max��c
		if (Max>c)
		{
			System.out.print("���ֵ��"+Max);
		}
		else
		{
			Max = c;
			System.out.print("���ֵ��"+Max);
		}
		
	}

}
