package shiyan5_1;

class Student{
	void Student()		//����һ�������κβ����ķ���
	{
		System.out.print("����ѧ��");
	}
	
	void Student(String a)		//����һ�������������ѧ�����ҵ�������***��***�Ǵ���Ĳ�����
	{
		System.out.print("����ѧ��,�ҵ�������"+a);
	}
}

public class R4 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Student student = new Student();	//ʵ����һ������
		student.Student("***");		//����Student�������������Ϊ***
	}

}
