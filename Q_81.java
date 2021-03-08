package pattern_class_work;

public class Q_81 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 5; i++)
		{
			int a =1;
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
				if(j<5)
				{
					a++;
				}
				else if(j==5)
				{
					
				}
				else
				{
					a--;
				}
			}
			System.out.println();
		}
	}
}
