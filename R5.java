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
		System.out.print("学号"+sNO+" ");
		return sNO;
	}
	
	String getName()
	{
		System.out.print("姓名"+sName+" ");
		return sName;
	}
	
	String getSex()
	{
		System.out.print("性别"+sSex+" ");
		return sSex;
	}
	
	int getAge()
	{
		System.out.print("年龄"+sAge+" ");
		return sAge;
	}
	
	int getJava()
	{
		System.out.println("Java分数"+sJava+" ");
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
		System.out.println("平均分是"+Ave);
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
		System.out.println("最高分"+max);
		System.out.println("最低分"+min);
	}
	
}

public class R5 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Stu student = new Stu();
		student.Student(1, "一", "男", 18, 100);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(2, "二", "男", 18, 95);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(3, "三", "男", 18, 90);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(4, "四", "男", 18, 85);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Student(5, "五", "男", 18, 80);
		student.getNO();
		student.getName();
		student.getSex();
		student.getAge();
		student.getJava();
		student.Average();
		student.MaxAndMin();
	}

}
