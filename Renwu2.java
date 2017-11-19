package Shiyan4_1;

import java.util.Arrays;

public class Renwu2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int myTable[] []= {
				{23,45,65,34,21,67,78},
				{46,14,18,46,98,63,88},
				{98,81,64,90,21,14,23},
				{54,43,55,76,22,43,33},
							};
		int[] iArr = new int[4];
		for(int i = 0; i<myTable.length; i++)
		{	int min = 1000000000;
			for(int j = 0; j<myTable[i].length; j++)
			{
				min = min < myTable[i][j] ? min:myTable[i][j];
				iArr[i] = min;
			}
			System.out.println("第"+(i+1)+"行的最小值是"+min);
		}
		int min2 = 100000000;
		for(int i = 0; i<iArr.length; i++)
		{
			min2 = min2<iArr[i] ? min2:iArr[i];
		}
		System.out.print("数组的最小值是"+min2);
	}

}
