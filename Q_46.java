package pattern_class_work;

public class Q_46 {

	public static void main(String[] args)
	{
		int b = 1;
		for (int i = 1; i <= 9; i++)
		{
			for (int j = 1; j <= 9; j++) 
			{
				if(i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(b+" ");
				}
			}
			System.out.println();
			b++;
		}
	}
}
