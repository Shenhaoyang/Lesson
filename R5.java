package shiyan5_1;

import java.util.Arrays;

class Stu{
	int sNO;
	String sName;
	String sSex;
	int sAge;
	int sJava;
	int JavaArr[] =new int[5] ;
	void Student(int sNO, String sName, String sSex, int sAge, int sJava)
	{
		this.sNO = sNO;
		this.sName = sName;
		this.sSex = sSex;
		this.sAge = sAge;
		this.sJava = sJava;
	}
	
	int getNO()
	{
		System.out.print("ѧ��"+sNO+" ");
		return sNO;
	}
	
	String getName()
	{
		System.out.print("����"+sName+" ");
		return sName;
	}
	
	String getSex()
	{
		System.out.print("�Ա�"+sSex+" ");
		return sSex;
	}
	
	int getAge()
	{
		System.out.print("����"+sAge+" ");
		return sAge;
	}
	
	int getJava()
	{
		System.out.println("Java����"+sJava+" ");
		JavaArr[sNO-1] = sJava;
		return sJava;
	}
	
	void Average()
	{
		int a = 0;
		for(int i = 0; i<JavaArr.length; i++)
		{
			a = a + JavaArr[i];
		}
		int Ave = a/5;
		System.out.println("ƽ������"+Ave);
	}
	
	void MaxAndMin()
	{
		int max = JavaArr[0];
		int min = JavaArr[0];
		for(int i = 0; i<JavaArr.length; i++)
		{
			max = JavaArr[i]>max ? JavaArr[i]:max;
			min = JavaArr[i]<min ? JavaArr[i]:min;
		}
		System.out.println("��߷�"+max);
		System.out.println("��ͷ�"+min);
	}
	
}

public class R5 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Stu student = new Stu();
		student.Student(1, "һ", "��", 18, 100);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(2, "��", "��", 18, 95);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(3, "��", "��", 18, 90);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(4, "��", "��", 18, 85);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(5, "��", "��", 18, 80);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Average();
		student.MaxAndMin();
	}

}
