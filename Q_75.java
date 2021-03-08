package pattern_class_work;

public class Q_75 {

	public static void main(String[] args)
	{
		for (int i = 1; i <= 11; i=i+2)
		{
			for (int j = 1; j <= 11; j++) 
			{
				
				if(i-j<0)
				{
					System.out.print(" ");
				}
				else
				{
					if(i==(2*j)-1)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
					
				}
			}
			System.out.println();
		}
	}
}
