package Shiyan2;

import java.util.Scanner;

public class Renwu6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		int M,Y,D;
		System.out.print("�����������");
		M=sc.nextInt();
		Y=M/60/24/365;		//ȡ��������
		D=(M/60/24)%365;	//��ȡ���������Ϊ2400�죬��ȡ��
		System.out.print("��ԼΪ"+Y+"��"+D+"��");
	}

}
