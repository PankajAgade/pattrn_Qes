package pattern_class_work;

public class Q_54 {

	public static void main(String[] args)
	{
		for (int i = 9; i >= 1; i--)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if (i+j>=10)
				{
					System.out.print(i+" ");
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
