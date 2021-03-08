package pattern_class_work;

public class Q_51 {

	public static void main(String[] args)
	{
		int a = 1;
		for (int i = 1; i <= 5; i++)
		{
			
			for (int j = 1; j <= 5; j++) 
			{
				if(i+j<=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a+" ");
				}
			}
			System.out.println();

			a++;
		}
		a--;
		for (int i = 4; i >= 1; i--)
		{
			a--;
			for (int j = 1; j <= 5; j++) 
			{
				if(i+j<=5)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a+" ");
				}
			}
			System.out.println();

		}
		
		
	}
}
