package shiyan5_1;

class Tuxing{
	//三角形
	float getArea(float a, float b, float c)
	{
		float s = (float)((1.0/4.0)*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))); 
		System.out.println("三角形的面积是"+s);
		return s;
	}
	
	//长方形
	float getArea(float a, float b)
	{
		float s = a*b;
		System.out.println("长方形的面积是"+s);
		return s;
	}
	
	//正方形
	float getArea(int a)
	{
		float s = a*a;
		System.out.println("正方形的面积是"+s);
		return s;
	}
	
	//圆形
	float getArea(float r)	
	{
		float s = (float) (Math.PI*r*r);
		System.out.println("圆形的面积是"+s);
		return s; 
	}
	
}
public class R3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Tuxing t = new Tuxing();
		t.getArea(3f);
		t.getArea(3);
		t.getArea(3, 4);
		t.getArea(3, 4, 5);
	}

}
