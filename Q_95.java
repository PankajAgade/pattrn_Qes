package pattern_class_work;

public class Q_95 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i-j>0)
				{
					System.out.print(" ");
				} 
				else 
				{
					if (i==1 || j==5 || i==j) 
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
