package Shiyan4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Renwu9 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] iArr = new int[10];
		System.out.println(Arrays.toString(iArr));
		int tmp1 = 0;
		int tmp2 = 0;										
		Scanner input = new Scanner(System.in);
		
		System.out.print("����������������");
		int num = input.nextInt();
		
		System.out.print("����������������λ���ǣ�");
		int target = input.nextInt();
		
		tmp1 = iArr[target];
		iArr[target] = num;
		for(int i = target+1; i<iArr.length; i++)
		{
			tmp2 = iArr[i];
			iArr[i] = tmp1;
		}
		System.out.print(Arrays.toString(iArr));
	}

}
