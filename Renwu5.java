package Shiyan4_1;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("����������������");
		int a = input.nextInt();
		int iArr[]= {1,2,3,4,5,6,7,8,9,10};
	     for(int i=0;i<iArr.length;i++)
	     {
	    	 if(a == iArr[i])
	    	 {
	    		 System.out.print("��������������е������ǣ�"+i);
	    		 return;
	    	 }
	    	 
	     }
	     System.out.print("������ֲ���������");
	}

}
