package shiyan5_3;

class People
{
   protected double weight,height;
   public void speakHello()
   {
       System.out.println("yayawawa");
   }  
  public void averageHeight()
   { 
      height=173;
      System.out.println("average height:"+height);
   }
  public void averageWeight()
   {
      weight=70;
      System.out.println("average weight:"+weight);
   }
}
class ChinaPeople extends People
{  
	public void speakHello() //��дpublic void speakHello()������Ҫ��������ơ���ã�������������
	{
		System.out.println("��ã�������");
	}      //������Ϣ
	public void averageHeight() //��дpublic void averageHeight()������Ҫ���������
	{
		height=168.78;
	    System.out.println("�й��˵�ƽ����ߣ�"+height+"����");
	}      //���й��˵�ƽ����ߣ�168.78���ס������ĺ�����Ϣ
	public void averageWeight()//��дpublic void averageWeight()������
	{
		weight=65;
	    System.out.println("�й��˵�ƽ�����أ�"+weight+"����");
	}      //Ҫ��������ơ��й��˵�ƽ�����أ�65��������ĺ�����Ϣ
   public void chinaGongfu()
   {
	   System.out.println("������,վ����,˯�繭");//����й���������Ϣ�����磺"������,վ����,˯�繭"��
   }
}
class AmericanPeople  extends People
{
	public void speakHello() //��дpublic void speakHello()������Ҫ���������
	{
		System.out.println("How do you do");
	}      //��How do you do��������Ӣ����Ϣ��
	public void averageHeight() //��дpublic void averageHeight()����
	{
		height=173;
	    System.out.println("AmericanPeople average height:"+height);
	}
	public void averageWeight() //��дpublic void averageWeight()����
	{
		weight=70;
	    System.out.println("AmericanPeople average weight:"+weight);
	}
   public void americanBoxing()
   {
	   System.out.println("ֱȭ����ȭ");//���ȭ������Ϣ�����磬��ֱȭ��������ȭ����
   }
}
class BeijingPeople extends ChinaPeople 
{
	public void speakHello()//��дpublic void speakHello()������Ҫ��������ơ����á������ĺ�����Ϣ
	{
		System.out.println("����");
	}
	public void averageHeight() //��дpublic void averageHeight()����
	{
		height=168.78;
	    System.out.println("�й��˵�ƽ����ߣ�"+height+"����");
	}
	public void averageWeight() //��дpublic void averageWeight()����
	{
		weight=65;
	    System.out.println("�й��˵�ƽ�����أ�"+weight+"����");
	}
  public void beijingOpera() 
   {
	  System.out.println("����");//����������Ϣ
   }
}
public class R2
{
  public static void main(String args[])
  {
      ChinaPeople chinaPeople=new ChinaPeople();
      AmericanPeople americanPeople=new AmericanPeople();
      BeijingPeople beijingPeople=new BeijingPeople();
      chinaPeople.speakHello();
      americanPeople.speakHello();
      beijingPeople.speakHello();
      chinaPeople.averageHeight();
      americanPeople.averageHeight();
      beijingPeople.averageHeight();
      chinaPeople.averageWeight();
      americanPeople.averageWeight();
      beijingPeople.averageWeight();
      chinaPeople.chinaGongfu();
      americanPeople.americanBoxing();
      beijingPeople.beijingOpera() ;
      beijingPeople.chinaGongfu();
  }  
}

