/**
 * 
 */
package shiyan3;

import java.util.Scanner;

/**
 * @author �����
 *
 */
public class Renwu1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ�����֣�");
		float a = input.nextFloat();
		System.out.println("������ڶ������֣�");
		float b = input.nextFloat();
		System.out.println("������ĵ�һ��������"+a+"��"+b);
		if (a>b)
		{
			System.out.print(a+">"+b);
		}
		else if (a<b)
		{
			System.out.print(a+"<"+b);
		}
		else
		{
			System.out.print(a+"="+b);
		}
		
	}

}
