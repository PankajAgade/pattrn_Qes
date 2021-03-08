package pattern_class_work;

public class Q_30 
{
	public static void main(String[] args) {
		char a ='F';
		for (int i = 1; i <= 12; i++)
		{
			char b = a;
			for (int j = 1; j <= 6; j++) 
			{
				
				if (i<=6)
				{
					
					if (i+j<=7)
					{
						System.out.print(b--);
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				else
				{
					if (i-j>=6)
					{
						System.out.print(--b);
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
			if (i<6)
			{
				a--;
			}
			else
			{
				a++;
			}
		}
		
	}
}
//i-j<=6