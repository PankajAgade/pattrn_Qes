package pattern_class_work;

public class Q_92 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i==j || i+j==10)
				{
					System.out.print("N");
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
