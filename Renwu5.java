package shiyan3;

import java.util.Scanner;

public class Renwu5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input = new Scanner(System.in);
		System.out.print("��ѧ���ɼ���");
		char Chengji = input.next().charAt(0);
		switch(Chengji)
		{
		case 'A':System.out.print("����");
				break;
		case 'B':
		case 'C':System.out.print("����");
				break;
		case 'D':System.out.print("����");
				break;
		case 'E':System.out.print("������");
				break;
		default: System.out.print("����");
		}
		
		
		
	}

}
