package shiyan5_5_6;

/**
 * 1��	����һ��People�࣬����name��age��sex��private���ԣ��ֱ��������Ƕ�Ӧ��get()��set()������
 * ��д�ĸ����췽���ֱ�Ϊ�޲�����1��������name����2��������name��age��������������name��age��sex����
 * ��дpublic String toString()���������ء��ҽ�***���ҽ���*�꣬����*��������Ϣ�����еġ�*���ŷֱ���name��age��sex�����е�ֵ�滻��
 * ��main�����зֱ������ֹ��췽��������ͬ�Ķ��󣬲�����toString()��������������Ϣ��
 * @author �����
 *
 */

class People{
	//����һ��People�࣬����name��age��sex��private����
	private String name;
	private int age;
	private String sex;
	
	//�ֱ��������Ƕ�Ӧ��get()��set()����
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
	
	//��д�ĸ����췽���ֱ�Ϊ�޲�����1��������name����2��������name��age��������������name��age��sex��
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
	
	//��дpublic String toString()���������ء��ҽ�***���ҽ���*�꣬����*��������Ϣ�����еġ�*���ŷֱ���name��age��sex�����е�ֵ�滻
	public String toString() {
		return "�ҽ�"+name+"���ҽ���"+age+"�꣬����"+sex+"��";
	}
}

public class S6_1 {

	public static void main(String[] args) {
		//��main�����зֱ������ֹ��췽��������ͬ�Ķ��󣬲�����toString()��������������Ϣ
		People people1 = new People();
		People people2 = new People("����");
		People people3 = new People("����",18);
		People people4 = new People("����",19,"��");
		System.out.println(people1.toString());
		System.out.println(people2.toString());
		System.out.println(people3.toString());
		System.out.println(people4.toString());
	}

}
//set��get������������
