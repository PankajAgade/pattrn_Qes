package pattern_class_work;

public class Q_77 {

	public static void main(String[] args)
	{
		int a = 1;
		for (int i = 1; i <= 5; i++)
		{
			int b =a;
			int c = 4;
			for (int j = 1; j <= 5; j++) 
			{
				if (i-j>=0) 
				{
					System.out.print(b+" ");
					b=b+c;
					c--;
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
