package shiyan5_5_6;

/**
 * 创建Rodent（啮齿动物）：Mouse（老鼠），Gerbil（鼹鼠），Hamster（大颊鼠）这样一个继承层次结构，
 * 在基类Rodent中提供对所有的Rodent都用用的方法，在子类中，根据特定的Rodent类型覆盖这些方法，以便他们执行不同的行为。
 * 创建一个Robent数组，填充不同的Rodent类型，然后调用基类方法，观察发生什么情况。
 * @author 沈皓扬
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
