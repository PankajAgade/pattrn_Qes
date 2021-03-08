package pattern_class_work;

public class Q_87 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i==j || i+j==6)
				{
					System.out.print("A");
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
