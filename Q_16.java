package pattern_class_work;

public class Q_16 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
					if((i-j<=0 && i+j<=10) || (i-j>=0 && i+j>=10))
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
