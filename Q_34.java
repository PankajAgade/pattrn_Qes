package pattern_class_work;

public class Q_34
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			char a = 'A';
			for (int j = 1; j <= 6; j++) 
			{
				if(i+j<=7)
				{
					System.out.print(a++);
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
