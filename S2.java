package shiyan5_4;

//定义一个抽象类Instrument（乐器）
abstract class Instrument{
	//成员变量name
	String name;
	
	//创建抽象方法play()
	abstract void play();
	
	//创建实例方法sayMyName()
	void sayMyName() {
		System.out.println(name);
	}
} 

//定义Piano类继承Instrument类
class Piano extends Instrument{
	//Piano类有一个构造函数，在构造函数中给成员变量name赋值。
	Piano(){
		name = "Piano";
	}
	
	//因为继承了抽象类Instrument，所以强制实现抽象类的抽象方法play()
	void play() {
		System.out.println("命运交响曲");
	}
	
}

//定义Saxophone类
class Saxophone extends Instrument{
	//Saxophone类有一个构造函数，在构造函数中给成员变量name赋值。
	Saxophone(){
		name = "Saxophone";
	}
	
	//因为继承了抽象类Instrument，所以强制实现抽象类的抽象方法play()
	void play() {
		System.out.println("回家");
	}
}

public class S2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Instrument instrument; 						//声明类Instrument的变量instrument
		instrument = new Piano();					//将子类实例Piano赋值给父类变量
		instrument.sayMyName();						//调用子类Piano继承并重写的父类Instrument的方法，体现多态性
		instrument.play();
		instrument = new Saxophone();				//将子类实例Saxophone赋值给父类变量
		instrument.sayMyName();						//调用子类Piano继承并重写的父类Instrument的方法，体现多态性
		instrument.play();
	}

}
