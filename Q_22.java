package pattern_class_work;

public class Q_22 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i-j<=0 && j-i<5)
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
