package pattern_class_work;

public class Q_89 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i==1 || i==5 || j==5 || j==1)
				{
					System.out.print("P");
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
