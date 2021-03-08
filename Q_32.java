package pattern_class_work;

public class Q_32
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			char a = 'F';
			for (int j = 1; j <= 6; j++) 
			{
				if(i+j<=7)
				{
					System.out.print(a--);
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
