package pattern_class_work;

public class Q_110 {

	public static void main(String[] args)
	{
		int a = 5;
		int b = 5;
		
		for(int i=1;i<=5;i++)
		{
			int c = b;
			for(int j=1;j<=5;j++)
			{
				
				if(i<=j)
				{
					System.out.print(a);
				}
				else
				{
					System.out.print(c++);
				}
			}
			System.out.println();
			b--;
		} 
	}
}
