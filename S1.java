package shiyan5_4;

//定义父类Shape
class Shape{
	//在父类Shape中有一个draw()方法
	void draw() 
	{
		
	}
}

//子类Triangle继承父类Shape
class Triangle extends Shape{
	//重写父类Shape的draw()方法
	void draw() {
		System.out.println("调用了Triangle的draw方法");
	}
}

//子类Square继承父类Shape
class Square extends Shape{
	//重写父类Shape的draw()方法
	void draw() {
		System.out.println("调用了Square的draw方法");
	}
}

//子类Circle继承父类Shape
class Circle extends Shape{
	//重写父类Shape的draw()方法
	void draw() {
		System.out.println("调用了Circle的draw方法");
	}
}

public class S1 {

	public static void main(String[] args) {
		Shape shape;					//声明类Shape的变量shape
		shape = new Triangle();			//将子类Triangle赋值给父类变量
		shape.draw();					//调用子类Triangle的draw()方法
		shape = new Square();			//将子类Square赋值给父类变量
		shape.draw();					//调用子类Square的draw()方法
		shape = new Circle();			//将子类Circle赋值给父类变量
		shape.draw();					//调用子类Circle的draw()方法
	}

}
