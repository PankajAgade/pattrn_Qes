package pattern_class_work;

public class Q_04 {
	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 6-i; j <= 5; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++)
		{
			for (int j = i; j <= 5; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
