package shiyan5_5_6;

import inter.pubInter;

class PubInterAchieve implements pubInter {

	public void method1() {
		System.out.println("method1ʵ����");

	}

	public void method2() {

		System.out.println("method2ʵ����");
	}

	public void method3() {

		System.out.println("method3ʵ����");
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
