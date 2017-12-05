package shiyan3_2;
import java.lang.Math;
public class Renwu1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int max = 0;
		int min = 100;
		int count = 0;
		for(int i=1;i<=100;i++ )
		{
			int num=(int)(Math.random()*99)+1;
			
			if(num>max)
				{
					max=num;
				}
			if(num<min) 
				{
					min=num;
				}
			if(num>50)
			{
				count++;
			}
		}
		System.out.print("Max="+max+"\n"+"Min="+min+"\n"+"count="+count);
	}

}
