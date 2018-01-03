package shiyan5_4;

//����һ��������Instrument��������
abstract class Instrument{
	//��Ա����name
	String name;
	
	//�������󷽷�play()
	abstract void play();
	
	//����ʵ������sayMyName()
	void sayMyName() {
		System.out.println(name);
	}
} 

//����Piano��̳�Instrument��
class Piano extends Instrument{
	//Piano����һ�����캯�����ڹ��캯���и���Ա����name��ֵ��
	Piano(){
		name = "Piano";
	}
	
	//��Ϊ�̳��˳�����Instrument������ǿ��ʵ�ֳ�����ĳ��󷽷�play()
	void play() {
		System.out.println("���˽�����");
	}
	
}

//����Saxophone��
class Saxophone extends Instrument{
	//Saxophone����һ�����캯�����ڹ��캯���и���Ա����name��ֵ��
	Saxophone(){
		name = "Saxophone";
	}
	
	//��Ϊ�̳��˳�����Instrument������ǿ��ʵ�ֳ�����ĳ��󷽷�play()
	void play() {
		System.out.println("�ؼ�");
	}
}

public class S2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Instrument instrument; 						//������Instrument�ı���instrument
		instrument = new Piano();					//������ʵ��Piano��ֵ���������
		instrument.sayMyName();						//��������Piano�̳в���д�ĸ���Instrument�ķ��������ֶ�̬��
		instrument.play();
		instrument = new Saxophone();				//������ʵ��Saxophone��ֵ���������
		instrument.sayMyName();						//��������Piano�̳в���д�ĸ���Instrument�ķ��������ֶ�̬��
		instrument.play();
	}

}
