package shiyan5_5_6;

import java.util.Random;

class Shape // 定义Shape类，有两个public方法draw()和erase()
{
	public void draw() {
	};

	public void erase() {
	};
}

class Circle extends Shape // 定义类Circle继承类Shape,重写draw()方法和erase()方法
{
	public void draw() {
		System.out.println("Circle.draw()");
	}

	public void erase() {
		System.out.println("Circle.erase()");
	};
}

class Square extends Shape // 定义类Square继承Shape,重写draw()方法和erase()方法
{
	public void draw() {
		System.out.println("Square.draw()");
	}

	public void erase() {
		System.out.println("Square.erase()");
	};
}

class Triangle extends Shape // 定义类Triangle继承Shape,重写draw()方法和erase()方法
{
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	public void erase() {
		System.out.println("Triangle.erase()");
	};
}

class RandomShapeGenerator	// 定义类RandomShapeGenerator，随机图形生成器
{
	private Random rand = new Random(); // 定义私有对象rand并实例化为类Random

	public Shape next()					 
	{
		switch (rand.nextInt(3))		//生成[0，2]的的数字，并用switch语句生成图形
		{

		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
}

public class S6_2 {
	private static RandomShapeGenerator gen = new RandomShapeGenerator(); // 定义私有静态变量gen，gen是类RandomShapeGenerator的实例化

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] s = new Shape[9]; // 定义一个自订类型Shape的数组s，容量为9
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = gen.next();	// 每个s[i]调用gen的next()方法
			s[i].draw();		// 每个s[i]调用draw()方法
		}
	}
}
//为什么s[i]调用gen.next()方法时都会跳到class 生成图形类，再跳到Shape类，再跳回生成图形类，再到return语句
//draw()方法是不是通过对象.方法来实现多态性的