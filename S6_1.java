package shiyan5_5_6;

/**
 * 1、	定义一个People类，包含name、age、sex等private属性，分别生成它们对应的get()和set()方法。
 * 编写四个构造方法分别为无参数、1个参数（name），2个参数（name、age）和三个参数（name、age、sex）。
 * 重写public String toString()方法，返回“我叫***，我今年*岁，我是*生”的信息，其中的“*”号分别用name、age和sex变量中的值替换。
 * 在main方法中分别用四种构造方法创建不同的对象，并调用toString()方法输出对象的信息。
 * @author 沈皓扬
 *
 */

class People{
	//定义一个People类，包含name、age、sex等private属性
	private String name;
	private int age;
	private String sex;
	
	//分别生成它们对应的get()和set()方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	//编写四个构造方法分别为无参数、1个参数（name），2个参数（name、age）和三个参数（name、age、sex）
	People(){
		
	}
	People(String name){
		this.name = name;
	}
	People(String name, int age){
		this.name = name;
		this.age = age;
	}
	People(String name, int age, String sex){
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
	
	//重写public String toString()方法，返回“我叫***，我今年*岁，我是*生”的信息，其中的“*”号分别用name、age和sex变量中的值替换
	public String toString() {
		return "我叫"+name+"，我今年"+age+"岁，我是"+sex+"生";
	}
}

public class S6_1 {

	public static void main(String[] args) {
		//在main方法中分别用四种构造方法创建不同的对象，并调用toString()方法输出对象的信息
		People people1 = new People();
		People people2 = new People("张三");
		People people3 = new People("李四",18);
		People people4 = new People("王五",19,"男");
		System.out.println(people1.toString());
		System.out.println(people2.toString());
		System.out.println(people3.toString());
		System.out.println(people4.toString());
	}

}
//set和get方法体现在哪
