package pattern_class_work;

public class Q_80 
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 10; j++) 
			{
				if (i-j<0 && i+j<11)  
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
