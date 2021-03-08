package pattern_class_work;

public class Q_71 
{

	public static void main(String[] args)
	{
		for (int i = 0; i <= 10; i=i+2)
		{
			int a = 1;
			for (int j = 0; j <= i; j++) 
			{ 
				
				System.out.print(a);
				if (j<i/2)
				{
					a++;
				} 
				else
				{
					a--;					
				}
			}
			System.out.println();
		}

			
	}
}
