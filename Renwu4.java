package Shiyan2;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1st integer:");
		int a=sc.nextInt();							//�����һ������
		System.out.println("Input 2st integer:");
		int b=sc.nextInt();							//����ڶ�������
		System.out.println("Sum of two integers: "+(a+b));			//���������ĺͣ�30
		System.out.println("Difference of two integers: "+(a-b));	//���������Ĳ20	
		System.out.println("Product of two integers: "+(a*b));		//���������ĳ˻���125
		System.out.println("Average of two integers: "+((a+b)/2));	//����������ƽ������15
		System.out.println("Distance of two integers: "+Math.abs(a-b));		//���������ľ��룺20
		System.out.println("Max integer: "+((a>b)?a:b));			//���������25
		System.out.println("Min integer: "+((a<b)?a:b));			//��С������5

		
		
	}

}
