package Shiyan2;

import java.util.Scanner;

public class Renwu7 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.print("����0��1000֮���������");
		int a = sc.nextInt();		//��������
		int g,s,b;
		g=a%10;					//ȡ��λ����ȡ�ࣩ
		s=(a%100)/10;			//ȡʮλ����ȡ���65�ڳ���10ȡ����
		b=a/100;				//ȡ��λ��������100ȡ����
		System.out.print("�����������������ֵ��ܺ�Ϊ��"+(g+s+b));
	}

}
