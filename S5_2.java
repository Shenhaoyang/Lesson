package shiyan5_5_6;

interface Eat   
{  
    void eat();  
}  
//�����ӿ�Eat
 
class Cow implements Eat   
{  
    public String name="Сĸţ"; 
    //����String�ͱ���name
    
    public void eat()   
    {  
       System.out.println("ĸţ�������");  
    }  
    //ʵ�ֽӿڵķ���eat
}  
class Hen implements Eat 
{  
    public String name="Сĸ��";        
    public void eat()     
    {  
       System.out.println("ĸ������С��");  
    }  
}  
 
public class S5_2  
{  
	public static void main(String[] args)  
	{   
		Eat animalEat = new Cow();  	//����Eat�����animalEat����ֵΪCow()
	    animalEat.eat();           		//����animalEat��eat()
	    animalEat=new Hen();        	//����animalEat��ֵΪHen()
	    animalEat.eat();          		//����animalEat��eat()�����ֶ�̬�ԡ�
	}  
} 

