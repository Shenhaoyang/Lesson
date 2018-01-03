package shiyan5_5_6;

import java.util.Random;

class Shape // ����Shape�࣬������public����draw()��erase()
{
	public void draw() {
	};

	public void erase() {
	};
}

class Circle extends Shape // ������Circle�̳���Shape,��дdraw()������erase()����
{
	public void draw() {
		System.out.println("Circle.draw()");
	}

	public void erase() {
		System.out.println("Circle.erase()");
	};
}

class Square extends Shape // ������Square�̳�Shape,��дdraw()������erase()����
{
	public void draw() {
		System.out.println("Square.draw()");
	}

	public void erase() {
		System.out.println("Square.erase()");
	};
}

class Triangle extends Shape // ������Triangle�̳�Shape,��дdraw()������erase()����
{
	public void draw() {
		System.out.println("Triangle.draw()");
	}

	public void erase() {
		System.out.println("Triangle.erase()");
	};
}

class RandomShapeGenerator	// ������RandomShapeGenerator�����ͼ��������
{
	private Random rand = new Random(); // ����˽�ж���rand��ʵ����Ϊ��Random

	public Shape next()					 
	{
		switch (rand.nextInt(3))		//����[0��2]�ĵ����֣�����switch�������ͼ��
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
	private static RandomShapeGenerator gen = new RandomShapeGenerator(); // ����˽�о�̬����gen��gen����RandomShapeGenerator��ʵ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] s = new Shape[9]; // ����һ���Զ�����Shape������s������Ϊ9
		for (int i = 0; i < s.length; i++) 
		{
			s[i] = gen.next();	// ÿ��s[i]����gen��next()����
			s[i].draw();		// ÿ��s[i]����draw()����
		}
	}
}
//Ϊʲôs[i]����gen.next()����ʱ��������class ����ͼ���࣬������Shape�࣬����������ͼ���࣬�ٵ�return���
//draw()�����ǲ���ͨ������.������ʵ�ֶ�̬�Ե�