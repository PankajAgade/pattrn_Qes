package pattern_class_work;

public class Q_23 
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i<=5)
				{
					if (i-j<=0 && j-i<5)
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
					if (i+j>=10 && i+j<=14)
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
