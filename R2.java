package shiyan5_1;

class Circle{
	float Radius; //存放圆的半径
	float Area;
	float Perimeter;
	void Circle()		//将半径设为0
	{
		Radius = 0;
	}
	void Circle(double r)	//创建Circle对象时半径初始化为r
	{
		Radius = (float) r;
	}
	double getArea()	//获取圆的面积
	{
		Area = (float) (Math.PI*Radius*Radius);
		return Area; 
	}
	double getPerimeter()	//获取圆的周长
	{
		Perimeter = (float)(Math.PI*2*Radius);
		return Perimeter;
	}
	void show()		//将圆的半径、周长、面积输出到屏幕
	{
		System.out.println("圆的半径是"+Radius);
		System.out.println("圆的周长是"+Perimeter);
		System.out.println("圆的面积是"+Area);
	}
}



public class R2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Circle r = new Circle();
		r.Circle(5);
		r.getArea();
		r.getPerimeter();
		r.show();
	}

}
