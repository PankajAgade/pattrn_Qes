package pattern_class_work;

public class Q_82 {

	public static void main(String[] args)
	{
		int a =1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 10; j++) 
			{
				if (i-j<0 && i+j<11)  
				{
					System.out.print(" ");
				}
				else 
				{
					System.out.print(a);
				}
			}
			System.out.println();
			a++;
		}
	}
}
