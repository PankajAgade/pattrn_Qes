package pattern_class_work;

public class Q_100 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++)
		{
			
			for (int j = 5; j >= 1; j--) 
			{
				if (i+j>10 || i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					if (j==1 || i==j || i+j==10)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}
}
