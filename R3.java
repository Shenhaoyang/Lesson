package shiyan5_1;

class Tuxing{
	//������
	float getArea(float a, float b, float c)
	{
		float s = (float)((1.0/4.0)*Math.sqrt((a+b+c)*(a+b-c)*(a+c-b)*(b+c-a))); 
		System.out.println("�����ε������"+s);
		return s;
	}
	
	//������
	float getArea(float a, float b)
	{
		float s = a*b;
		System.out.println("�����ε������"+s);
		return s;
	}
	
	//������
	float getArea(int a)
	{
		float s = a*a;
		System.out.println("�����ε������"+s);
		return s;
	}
	
	//Բ��
	float getArea(float r)	
	{
		float s = (float) (Math.PI*r*r);
		System.out.println("Բ�ε������"+s);
		return s; 
	}
	
}
public class R3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Tuxing t = new Tuxing();
		t.getArea(3f);
		t.getArea(3);
		t.getArea(3, 4);
		t.getArea(3, 4, 5);
	}

}
