package Shiyan4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Renwu9 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] iArr = new int[10];
		System.out.println(Arrays.toString(iArr));
		int tmp1 = 0;
		int tmp2 = 0;										
		Scanner input = new Scanner(System.in);
		
		System.out.print("输入你想插入的数：");
		int num = input.nextInt();
		
		System.out.print("输入你想插入的索引位置是：");
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
