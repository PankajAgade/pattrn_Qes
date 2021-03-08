package pattern_class_work;

public class Q_38 
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			int a = 1;
			for (int j = 1; j <= 6; j++) 
			{
				if(i-j>=0)
				{
					System.out.print(a++);
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
