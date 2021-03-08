package pattern_class_work;

public class Q_97 {

public static void main(String[] args) {
		
		for (int i = 5; i >= 1; i--)
		{
			
			for (int j = 1; j <= 5; j++) 
			{
				if(i+j<=5)
				{
					System.out.print(" ");
				}
				else
				{
					if (j==5 || i+j==6 || i==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
