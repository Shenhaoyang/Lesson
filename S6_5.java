package shiyan5_5_6;

//�����ӿ�Instrument������play()��adjust()
interface Instrument{
	void play();
	void adjust();
}

//������Wind��ʵ�ֽӿ�Instrument��ʵ�ֽӿڵķ�������дtoString����
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

//������Percussion��ʵ�ֽӿ�Instrument��ʵ�ֽӿڵķ�������дtoString����
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

//������Brass�̳���Wind
class Brass extends Wind{
	public String toString(){
		return "Brass";
	}
}

//������Brass�̳���Wind
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

