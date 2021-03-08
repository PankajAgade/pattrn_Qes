package pattern_class_work;

public class Q_36
{
	public static void main(String[] args)
	{
		char a = 'A';
		for (int i = 1; i <= 6; i++)
		{
			char b = a;
			for (int j = 1; j <= 6; j++) 
			{
				if(i-j>=0)
				{
					System.out.print(b);
					b=(char) (b+5);
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
