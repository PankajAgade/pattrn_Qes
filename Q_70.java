package pattern_class_work;

public class Q_70 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i=i+2)
		{
			for (int j = 10-i; j <= 9; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
