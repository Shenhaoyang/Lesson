package shiyan3;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input = new Scanner(System.in);
		System.out.print("若学生成绩是");
		char Chengji = input.next().charAt(0);
		switch(Chengji)
		{
		case 'A':System.out.print("优秀");
				break;
		case 'B':
		case 'C':System.out.print("良好");
				break;
		case 'D':System.out.print("及格");
				break;
		case 'E':System.out.print("不及格");
				break;
		default: System.out.print("错误");
		}
		
		
		
	}

}
