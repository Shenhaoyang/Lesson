package shiyan5_4;

//���常��Shape
class Shape{
	//�ڸ���Shape����һ��draw()����
	void draw() 
	{
		
	}
}

//����Triangle�̳и���Shape
class Triangle extends Shape{
	//��д����Shape��draw()����
	void draw() {
		System.out.println("������Triangle��draw����");
	}
}

//����Square�̳и���Shape
class Square extends Shape{
	//��д����Shape��draw()����
	void draw() {
		System.out.println("������Square��draw����");
	}
}

//����Circle�̳и���Shape
class Circle extends Shape{
	//��д����Shape��draw()����
	void draw() {
		System.out.println("������Circle��draw����");
	}
}

public class S1 {

	public static void main(String[] args) {
		Shape shape;					//������Shape�ı���shape
		shape = new Triangle();			//������Triangle��ֵ���������
		shape.draw();					//��������Triangle��draw()����
		shape = new Square();			//������Square��ֵ���������
		shape.draw();					//��������Square��draw()����
		shape = new Circle();			//������Circle��ֵ���������
		shape.draw();					//��������Circle��draw()����
	}

}
