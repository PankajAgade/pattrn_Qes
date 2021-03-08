package pattern_class_work;

public class Q_27 
{
	public static void main(String[] args)
	{
		char a = 'A';
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				
				if (i<=5)
				{
					if (i-j>=0)
					{
						System.out.print(a);
						
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				else
				{
					if (i+j<=10)
					{
						System.out.print(a);
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
			if (i<5)
			{
				a++;
			}
			else
			{
				a--;
			}
		}
		
	}
}
