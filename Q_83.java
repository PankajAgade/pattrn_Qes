package pattern_class_work;

public class Q_83 {

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
					a++;
				}
				if(j==5)
				{
					a=1;
				}
			}
			System.out.println();
		}
	}
}
