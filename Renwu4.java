package shiyan3_2;


public class Renwu4 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int N = 2;
		for(int i=N ; N<=10 ; N = N+2 )
		{
			int a = 1;
			for(int j=1 ; j<=N ; j++)
			{
				
				a = a*j;
			}
			System.out.println(N+"!="+a);
		}
	}

}
