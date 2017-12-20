package shiyan5_3;

/**
 * 1、	编程定义一个Car类，
		(1)	包括轮胎(tire)，发动机(engine)等public成员变量；
		(2)	包括一个public类型的showInfo()成员方法，在showInfo方法中输出car类所有成员变量的信息；
		(3)	创建一个Car类的实例，调用showInfo()方法。

 * @author 沈皓扬
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
 * 定义一个Toyota类，
		(1)	继承了Car的所有可以继承的属性和方法，成员变量tire值为“韩泰轮胎”，成员变量engine值为“自然吸气”；
		(2)	有一个public类型的成员变量 logo，值为“TOYOTA”；
		(3)	有一个public类型的成员方法speedUp()，输出“加速很平稳”；
		(4)	在showInfo()方法中输出Toyota类的所有成员变量的信息；
		(5)	创建一个Toyota类的实例，调用showInfo()和speedUp()方法。

 * @author 沈皓扬
 *
 */
class Toyota extends Car{
	public String tire = "韩泰轮胎";
	public String engine = "自然吸气";			//(1)
	
	public String logo = "TOYOTA";		//(2)
	
	public void speedUp()				//(3)
	{
		System.out.println("加速很平稳");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine);
	}
}

/**
 * 定义一个Volkswagen类，
		(1)	继承了Car的所有可以继承的属性和方法，成员变量tire值为“米其林轮胎”，成员变量engine值为“涡轮增压”
		(2)	有一个public类型的成员变量 logo，值为“VOLKSWAGEN”；
		(3)	有一个public类型的成员方法stop()，输出“刹车距离短”；
		(4)	在showInfo()方法中输出Volkswagen类的所有成员变量的信息；
		(5)	创建一个Volkswagen类的实例，调用showInfo()和stop()方法。

 * @author 沈皓扬
 *
 */
class Volkswagen extends Car{
	public String tire = "米其林轮胎";
	public String engine = "涡轮增压";			//(1)
	
	public String logo = "VOLKSWAGEN";		//(2)
	
	public void stop()				//(3)
	{
		System.out.println("刹车距离短");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine);
	}
}

/**
 * 定义一个GOLF类，
		(1)	继承了Volkswagen的所有可以继承的属性和方法，
		(2)	有一个private类型的成员变量 controlSystem，值为 “PQ36”
		(3)	重写父类的stop()方法，输出“刹车很给力”；
		(4)	在showInfo()方法中输出GOLF类的所有成员变量的信息；
		(5)	创建一个GOLF类的实例，调用showInfo()和stop()方法。
 * @author 沈皓扬
 *
 */
class GOLF extends Volkswagen{
	private String controlSystem = "PQ36";		//(2)
	
	public void stop()							//(3)
	{
		System.out.println("刹车很给力");
	}
	
	public void showInfo()				//(4)
	{
		System.out.println(tire+" "+engine+" "+controlSystem);
	}
}


public class R1 {

	public static void main(String[] args) {
		// 创建一个Car类的实例，调用showInfo()方法。
		Car car = new Car();
		car.showInfo();						
		
		//创建一个Toyota类的实例，调用showInfo()和speedUp()方法。
		Toyota toyota = new Toyota();
		toyota.showInfo();
		toyota.speedUp();
		
		//创建一个Volkswagen类的实例，调用showInfo()和stop()方法。
		Volkswagen volkswagen = new Volkswagen();
		volkswagen.showInfo();
		volkswagen.stop();
		
		//创建一个GOLF类的实例，调用showInfo()和stop()方法。
		GOLF golf = new GOLF();
		golf.showInfo();
		golf.stop();
	}

}
