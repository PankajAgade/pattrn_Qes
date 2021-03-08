package pattern_class_work;

public class Q_20 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			for (int j = 1; j <= 10; j++) 
			{
				if (i<=5)
				{
					if(j-i>=5)
					{
						System.out.print("*");
					}
					else if(i+j<=6)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				else
				{
					if(i+j>15 )
					{
						System.out.print("*");
					}
					else if (i-j>4) 
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
