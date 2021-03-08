package pattern_class_work;

public class Q_105_2 {
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if (i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					if(j%2==0)
					{
						System.out.print("0");
					}
					else
					{
						System.out.print("1");
					}
				}
			}
			System.out.println();
		}
	}
}
