package Shiyan2;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		int A = sc.nextInt();    //��������123456
		int a = A/100000;       //ȡ��1
		int b = A/10000%10;		//   ȡ��2
		int c = A/1000%10;		//ȡ��3
		int d = A/100%10;		//ȡ��4
		int e = A/10%10;		//ȡ��5
		int f = A%10;			//ȡ��6
		System.out.print(a+" "+b+" "+c+" "+d+" "+e+" "+f);
		
		
	}

}
