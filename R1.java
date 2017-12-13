package shiyan5_2;

class Method{
	//类变量
	static int a;
	//实例变量
	int b;
	
	//类方法
	static void Method1(int a){
		a = a;
		System.out.println(a);
	}
	
	//实例方法
	void Method2(int b){
		this.b = b;
		System.out.print(this.b);
	}
}

public class R1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Method.Method1(4);
		Method method = new Method();
		method.Method2(2);
		
	}

}
