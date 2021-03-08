package pattern_class_work;

public class Q_53 {

	public static void main(String[] args)
	{
		
		for (int i = 1; i <= 9; i++)
		{
			int a =1;
			for (int j = 1; j <= 9; j++) 
			{
				if (i+j>=10)
				{
					System.out.print(a+++" ");
				} 
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			a++;
		}
	}
}
