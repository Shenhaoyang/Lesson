package shiyan5_2;

class Arr{
	void arr(int [] iArr) {
		int max = iArr[0];
		int min = iArr[0];
		for(int i = 0; i<iArr.length; i++)
		{
			max = iArr[i]>max ? iArr[i]:max;
			min = iArr[i]<min ? iArr[i]:min;
		}
		int count = 0; 				//�����������㱻ɾȥ�����ָ�����
		for(int i = 0; i<iArr.length; i++) {
			if(max == iArr[i]) 
				{
				iArr[i] = 0;
				count++;
				}
			if(min == iArr[i]) 
				{
				iArr[i] = 0;
				count++;
				}
		}
		int S = 0;
		for(int i = 0; i<iArr.length; i++)
		{
			S = S + iArr[i];
		}
		System.out.print("ƽ��ֵ��"+((double)S/(iArr.length-count)));
	}	
}


public class R3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [] iArr = {1,3,5,7,2,4,6,8,8,1};
		Arr method = new Arr();
		method.arr(iArr);
	}

}
