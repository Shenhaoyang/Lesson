package shiyan5_1;

class Student{
	void Student()		//构造一个不带任何参数的方法
	{
		System.out.print("我是学生");
	}
	
	void Student(String a)		//构造一个方法输出我是学生，我的名字是***（***是传入的参数）
	{
		System.out.print("我是学生,我的名字是"+a);
	}
}

public class R4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Student student = new Student();	//实例化一个对象
		student.Student("***");		//调用Student方法，传入参数为***
	}

}
