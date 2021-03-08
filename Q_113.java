package pattern_class_work;

public class Q_113 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 13; i++)
		{
			for (int j = 1; j <= 17; j++) 
			{
				if (i-j>=5 || i+j>=23 || j-i>=14 || i+j<=4 || (j-i>=6 && i+j<=12))//
				{//
					System.out.print("  ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
