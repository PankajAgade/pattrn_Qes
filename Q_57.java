package pattern_class_work;

public class Q_57 {

public static void main(String[] args) {
		int a = 1;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 6-i; j <= 5; j++) 
			{
				System.out.print(a++);
			}
			System.out.println();
		}
	}
}
