package shiyan5_3;

/**
 * 1��	��̶���һ��Car�࣬
		(1)	������̥(tire)��������(engine)��public��Ա������
		(2)	����һ��public���͵�showInfo()��Ա��������showInfo���������car�����г�Ա��������Ϣ��
		(3)	����һ��Car���ʵ��������showInfo()������

 * @author �����
 *
 */
class Car{
	public String tire = "tire";
	public String engine = "engine";			//(1)
	
	public void showInfo()						//(2)
	{
		System.out.println(tire+" "+engine);
	}
}

/**
 * ����һ��Toyota�࣬
		(1)	�̳���Car�����п��Լ̳е����Ժͷ�������Ա����tireֵΪ����̩��̥������Ա����engineֵΪ����Ȼ��������
		(2)	��һ��public���͵ĳ�Ա���� logo��ֵΪ��TOYOTA����
		(3)	��һ��public���͵ĳ�Ա����speedUp()����������ٺ�ƽ�ȡ���
		(4)	��showInfo()���������Toyota������г�Ա��������Ϣ��
		(5)	����һ��Toyota���ʵ��������showInfo()��speedUp()������

 * @author �����
 *
 */
class Toyota extends Car{
	public String tire = "��̩��̥";
	public String engine = "��Ȼ����";			//(1)
	
	public String logo = "TOYOTA";		//(2)
	
	public void speedUp()				//(3)
	{
		System.out.println("���ٺ�ƽ��");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine);
	}
}

/**
 * ����һ��Volkswagen�࣬
		(1)	�̳���Car�����п��Լ̳е����Ժͷ�������Ա����tireֵΪ����������̥������Ա����engineֵΪ��������ѹ��
		(2)	��һ��public���͵ĳ�Ա���� logo��ֵΪ��VOLKSWAGEN����
		(3)	��һ��public���͵ĳ�Ա����stop()�������ɲ������̡���
		(4)	��showInfo()���������Volkswagen������г�Ա��������Ϣ��
		(5)	����һ��Volkswagen���ʵ��������showInfo()��stop()������

 * @author �����
 *
 */
class Volkswagen extends Car{
	public String tire = "��������̥";
	public String engine = "������ѹ";			//(1)
	
	public String logo = "VOLKSWAGEN";		//(2)
	
	public void stop()				//(3)
	{
		System.out.println("ɲ�������");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine);
	}
}

/**
 * ����һ��GOLF�࣬
		(1)	�̳���Volkswagen�����п��Լ̳е����Ժͷ�����
		(2)	��һ��private���͵ĳ�Ա���� controlSystem��ֵΪ ��PQ36��
		(3)	��д�����stop()�����������ɲ���ܸ�������
		(4)	��showInfo()���������GOLF������г�Ա��������Ϣ��
		(5)	����һ��GOLF���ʵ��������showInfo()��stop()������
 * @author �����
 *
 */
class GOLF extends Volkswagen{
	private String controlSystem = "PQ36";		//(2)
	
	public void stop()							//(3)
	{
		System.out.println("ɲ���ܸ���");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine+" "+controlSystem);
	}
}


public class R1 {

	public static void main(String[] args) {
		// ����һ��Car���ʵ��������showInfo()������
		Car car = new Car();
		car.showInfo();						
		
		//����һ��Toyota���ʵ��������showInfo()��speedUp()������
		Toyota toyota = new Toyota();
		toyota.showInfo();
		toyota.speedUp();
		
		//����һ��Volkswagen���ʵ��������showInfo()��stop()������
		Volkswagen volkswagen = new Volkswagen();
		volkswagen.showInfo();
		volkswagen.stop();
		
		//����һ��GOLF���ʵ��������showInfo()��stop()������
		GOLF golf = new GOLF();
		golf.showInfo();
		golf.stop();
	}

}
