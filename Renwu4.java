package shiyan3;

import java.util.Scanner;

public class Renwu4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
			int year;
			System.out.println("请输入年份:");
			Scanner input=new Scanner(System.in); 
			year=input.nextInt(); 
			if(year%4==0&&year%100!=0||year%400==0)
			{
			System.out.println("是闰年");
			}
			else
			{
			System.out.println("不是闰年");
			}
	}

}
