package pattern_class_work;

public class Q_55 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			int a = 1;
			for (int j = 6-i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++)
		{
			int a = 1;
			for (int j = i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
