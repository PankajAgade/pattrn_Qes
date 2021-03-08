package pattern_class_work;

public class Q_43 
{
	public static void main(String[] args)
	{
		int a = 5;
		for (int i = 1; i <= 5; i++)
		{
			int b = a;
			for (int j = 1; j <= 5; j++) 
			{
				if(i-j>=0)
				{
					System.out.print(b++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			a--;
			System.out.println();
		}
	}
}
