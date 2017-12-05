package Shiyan2;

import java.util.Scanner;

public class Renwu1 
{

	public static <C> void main(String[] args) 
	{
		double F;
		double C;
		Scanner  sc = new Scanner(System.in);

		System.out.println("输入华氏度：");
		F = sc.nextDouble();
		C = (F-32)*5/9;
		System.out.println("摄氏度为："+C);
		
		// TODO Auto-generated method stub
		
	}

}
