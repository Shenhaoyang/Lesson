package shiyan5_2;

class Method{
	//�����
	static int a;
	//ʵ������
	int b;
	
	//�෽��
	static void Method1(int a){
		a = a;
		System.out.println(a);
	}
	
	//ʵ������
	void Method2(int b){
		this.b = b;
		System.out.print(this.b);
	}
}

public class R1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Method.Method1(4);
		Method method = new Method();
		method.Method2(2);
		
	}

}
