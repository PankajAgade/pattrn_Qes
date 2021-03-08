package pattern_class_work;

public class Q_25
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			char a = 'A';
			for (int j = 6-i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
