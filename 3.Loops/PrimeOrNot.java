public class PrimeOrNot {
	public static void main(String[] args)
	{
		int num = 16;
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) 
		{
			if (num % i == 0)
			flag = false;
		}
		if (flag && num != 1)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is NOT a prime number");
	}
}