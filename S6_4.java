package shiyan5_5_6;

/**
 * ����Rodent�����ݶ����Mouse�����󣩣�Gerbil�����󣩣�Hamster�����������һ���̳в�νṹ��
 * �ڻ���Rodent���ṩ�����е�Rodent�����õķ������������У������ض���Rodent���͸�����Щ�������Ա�����ִ�в�ͬ����Ϊ��
 * ����һ��Robent���飬��䲻ͬ��Rodent���ͣ�Ȼ����û��෽�����۲췢��ʲô�����
 * @author �����
 *
 */

class Rodent{
	void run() {
		
	}
}

class Mouse extends Rodent{
	void run() {
		System.out.println("Mouse run");
	}
}

class Gerbil extends Rodent{
	void run() {
		System.out.println("Gerbil run");
	}
}

class Hamster extends Rodent{
	void run() {
		System.out.println("Hamster run");
	}
}



public class S6_4 {

	public static void main(String[] args) {
		Rodent[] r = new Rodent[9];
		for (int j = 0; j < r.length; j++) {
//			switch(j % 3) {
//			default:
//			case 0 : r[j] = new Mouse();
//			case 1 : r[j] = new Gerbil();
//			case 2 : r[j] = new Hamster();
//			}
			if (j % 3 == 0)
				r[j] = new Mouse();					
			else if (j % 3 == 1)
				r[j] = new Gerbil();					
			else if (j % 3 == 2)
				r[j] = new Hamster();
			
			r[j].run();
		}
		
			
		
		
	}

}
