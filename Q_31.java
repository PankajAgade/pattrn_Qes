package pattern_class_work;

public class Q_31
{

	public static void main(String[] args)
	{
		for (int i = 1; i <= 6; i++)
		{
			char a = 'A';
			for (int j = 1; j <= 6; j++) 
			{
				if(i+j<=6)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(a+++" ");
				}
			}
			System.out.println();
		}
	}
}
