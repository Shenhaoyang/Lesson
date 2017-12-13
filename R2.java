package shiyan5_2;

import java.util.Arrays;

class PaiXv{
	public void method(int [] iArr) {
		for(int i = 0; i<iArr.length/2; i++)
		{
			int tmp;
			tmp = iArr[i];
			iArr[i] = iArr[iArr.length-1-i];
			iArr[iArr.length-1-i] = tmp;
		}
	}
}



public class R2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [] iArr = {3,5,1,9};
		PaiXv paixv = new PaiXv();
		paixv.method(iArr);
		System.out.print(Arrays.toString(iArr));
	}

}
