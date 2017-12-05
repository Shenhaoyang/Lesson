/**
 * 
 */
package shiyan3;

import java.util.Scanner;

/**
 * @author 沈皓扬
 *
 */
public class Renwu1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数字：");
		float a = input.nextFloat();
		System.out.println("请输入第二个数字：");
		float b = input.nextFloat();
		System.out.println("你输入的第一个数字是"+a+"和"+b);
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
