package shiyan5_5_6;

import inter.pubInter;

class PubInterAchieve implements pubInter {

	public void method1() {
		System.out.println("method1实现了");

	}

	public void method2() {

		System.out.println("method2实现了");
	}

	public void method3() {

		System.out.println("method3实现了");
	}

}

public class S5_3 {
	public static void main(String[] args) {
		PubInterAchieve inter = new PubInterAchieve();
		inter.method1();
		inter.method2();
		inter.method3();
	}

}
