package pattern_class_work;

public class Q_29 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++)
		{
			char a ='A';
			for (int j = i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
		for (int i = 2; i <= 5; i++)
		{
			char a ='A';
			for (int j = 6-i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
