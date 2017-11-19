package Shiyan4_1;

public class Renwu7 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] iArr = {1,2,3,4,5,6,7,8,9,10};
		int max = iArr[0];
		int min = iArr[0];
		for(int i = 0; i<iArr.length; i++)
		{
			max = iArr[i]>max ? iArr[i]:max;
			min = iArr[i]<min ? iArr[i]:min;
		}
		System.out.println("MAX="+max);
		System.out.println("MIN="+min);
	}

}
