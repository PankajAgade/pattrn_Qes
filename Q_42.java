package pattern_class_work;

public class Q_42 
{
	public static void main(String[] args)
	{
		int a = 1;
		for (int i = 1; i <= 10; i++)
		{
			int b = a;
			for (int j = 1; j <= 5; j++) 
			{
				if (i<=5)
				{
					if(i-j<=0)
					{
						System.out.print(b+++" ");
						
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					if(i+j>=11)
					{
						b++;
						System.out.print(b+" ");
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
