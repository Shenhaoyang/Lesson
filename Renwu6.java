package Shiyan4_1;

import java.util.Scanner;

public class Renwu6 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.print("������Ҫɾ�������֣�");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0; i<iArr.length; i++)
		{
			if(a == iArr[i])
			{
				iArr[i]=0;
			}
		}
		System.out.print("���ڵ�������");
		for(int i=0; i<iArr.length; i++)
		{
			System.out.print(iArr[i]+" ");
		}
	}

}
