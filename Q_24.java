package pattern_class_work;

public class Q_24
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i<=5)
				{
					if (i+j>=6 && i+j<=10)
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
					if (i-j<=4 && i-j>=0)
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
