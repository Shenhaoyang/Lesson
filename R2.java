package shiyan5_1;

class Circle{
	float Radius; //���Բ�İ뾶
	float Area;
	float Perimeter;
	void Circle()		//���뾶��Ϊ0
	{
		Radius = 0;
	}
	void Circle(double r)	//����Circle����ʱ�뾶��ʼ��Ϊr
	{
		Radius = (float) r;
	}
	double getArea()	//��ȡԲ�����
	{
		Area = (float) (Math.PI*Radius*Radius);
		return Area; 
	}
	double getPerimeter()	//��ȡԲ���ܳ�
	{
		Perimeter = (float)(Math.PI*2*Radius);
		return Perimeter;
	}
	void show()		//��Բ�İ뾶���ܳ�������������Ļ
	{
		System.out.println("Բ�İ뾶��"+Radius);
		System.out.println("Բ���ܳ���"+Perimeter);
		System.out.println("Բ�������"+Area);
	}
}



public class R2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Circle r = new Circle();
		r.Circle(5);
		r.getArea();
		r.getPerimeter();
		r.show();
	}

}
