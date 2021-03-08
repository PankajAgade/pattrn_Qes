package pattern_class_work;

public class Q_72 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 9; i=i+2)
		{
			int a = 1;
			for (int j = 1; j <= 9; j++) 
			{
				
				if(i+j<=9)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print(a+" ");
					if (j<=5)
					{
						a++;
					} 
					else
					{
						a--;					
					}
				}
			}
			System.out.println();
		}
	}
}
