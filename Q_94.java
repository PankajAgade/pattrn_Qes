package pattern_class_work;

public class Q_94 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i+j==6 || i==1 || j==1)
				{
					System.out.print("*");
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
