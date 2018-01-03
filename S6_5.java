package shiyan5_5_6;

//创建接口Instrument，包含play()和adjust()
interface Instrument{
	void play();
	void adjust();
}

//创建类Wind，实现接口Instrument，实现接口的方法并重写toString方法
class Wind implements Instrument{
	public void play(){
		System.out.println(this + " play()");
	}

	public void adjust() {	
		System.out.println( this + " adjust()");
	}
	
	public String toString(){
		return "Wind";
	}
}

//创建类Percussion，实现接口Instrument，实现接口的方法并重写toString方法
class Percussion implements Instrument{

	public void play(){
		System.out.println(this + " play()");
	}

	public void adjust() {	
		System.out.println( this + " adjust()");
	}
	
	public String toString(){
		return "Percussion";
	}
}

//创建类Brass继承类Wind
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}

//创建类Brass继承类Wind
class Woodwind extends Wind{
	public String toString(){
		return "Woodwind";
	}
}

public class S6_5 {

	public static void main(String[] args) {
		
		Instrument [] orchestra = {
				new Wind(), 
				new Percussion(), 
				new Brass(), 
				new Woodwind()
		};
		
		for (int i = 0; i < orchestra.length; i++){
			orchestra[i].play();
		}
		
	}

}

