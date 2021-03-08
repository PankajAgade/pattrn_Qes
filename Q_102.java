package pattern_class_work;

public class Q_102 {

	public static void main(String[] args)
	{
		for (int i = 5; i >= 1; i--)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i+j<=5 || i+j>=11)
				{
					System.out.print(" ");
				}
				else
				{
					if(i==1 || i==5 || i+j==6 || i+j==10)
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
