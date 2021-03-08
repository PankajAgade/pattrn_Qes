package pattern_class_work;

public class Q_58 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			int a = 1;
			for (int j = 1; j <= 5; j++) 
			{
				if (i<=5)
				{
					if (i+j<=6)
					{
						System.out.print(a++);
					} 
					else 
					{
						System.out.print(" ");
					}
				} 
				else 
				{
					if (i-j>=4)
					{
						System.out.print(a++);
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
