package Shiyan4_1;

import java.util.Arrays;

public class Renwu1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] iArr = new int[100];
		for(int i = 0; i<iArr.length; i++)
		{
			iArr[i] = (int)(Math.random()*99)+1;
		}
		//创建一个100个整数的随机数组
		int tmp;
		for(int i = 0; i<iArr.length; i++)
		{
			for(int j = i+1; j<iArr.length; j++)
			{
				if(iArr[i]<iArr[j])
				{
					tmp = iArr[i];
					iArr[i] = iArr[j];
					iArr[j] = tmp;
				}
			}
		}
		System.out.print(Arrays.toString(iArr));
		 
	}

}
