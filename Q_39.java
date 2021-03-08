package pattern_class_work;

public class Q_39 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			int a = 5;
			for (int j = 1; j <= 5; j++) 
			{
				if(i-j>=0)
				{
					System.out.print(a--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
