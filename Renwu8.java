package Shiyan4_1;

public class Renwu8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] iArr = {1,2,3,4,5,6,7,8,9,10,2};
		
		double i = num(iArr);
		if(i == 0.1)
		{
			System.out.print("没有重复数字");
		}
		else {
		System.out.print("重复的数字是："+iArr[(int) i]);
		}
	}
	/*
	 * 返回重复数字
	 */
	public static double num(int[] iArr) {
		for(int i = 0; i<iArr.length; i++)
		{
			for(int j = i+1; j<iArr.length; j++)
			{
				if(iArr[i] == iArr[j]) 
				{
					return i;
				}
			}
			
		}
		return 0.1;
	}
}
