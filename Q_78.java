package pattern_class_work;

public class Q_78 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 20; j++) 
			{
				if ((i-j<0 && j<6) || (i+j>11 && j-i<10) || (i+j<=20 && j>15))
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
