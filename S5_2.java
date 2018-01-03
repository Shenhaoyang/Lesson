package shiyan5_5_6;

interface Eat   
{  
    void eat();  
}  
//创建接口Eat
 
class Cow implements Eat   
{  
    public String name="小母牛"; 
    //创建String型变量name
    
    public void eat()   
    {  
       System.out.println("母牛爱吃青草");  
    }  
    //实现接口的方法eat
}  
class Hen implements Eat 
{  
    public String name="小母鸡";        
    public void eat()     
    {  
       System.out.println("母鸡爱吃小虫");  
    }  
}  
 
public class S5_2  
{  
	public static void main(String[] args)  
	{   
		Eat animalEat = new Cow();  	//创建Eat类变量animalEat并赋值为Cow()
	    animalEat.eat();           		//调用animalEat的eat()
	    animalEat=new Hen();        	//变量animalEat赋值为Hen()
	    animalEat.eat();          		//调用animalEat的eat()，体现多态性。
	}  
} 

