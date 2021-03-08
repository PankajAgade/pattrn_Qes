package pattern_class_work;

public class Q_115 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if ((i==1 && j!=5) || i==4 || j==1 || (j==5 && i!=1 && i!=7) || (i==7 && j!=5))
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
