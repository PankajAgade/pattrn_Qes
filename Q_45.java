package pattern_class_work;

public class Q_45 {

	public static void main(String[] args)
	{
		
		for (int i = 1; i <= 9; i++)
		{
			int b = 1;
			for (int j = 1; j <= 9; j++) 
			{
				if(i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(b+++" ");
				}
			}
			System.out.println();
		}
	}
}
