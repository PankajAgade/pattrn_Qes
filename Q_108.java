package pattern_class_work;

public class Q_108 {

	public static void main(String[] args)
	{
		int a=1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++) 
			{
				if(i==j)
				{
					System.out.print(a++);
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}
