package package1;

public class Assing
{
	//Solving the expression 
	 // (10+2)(10-2)
	public int Sum(int a, int b)
	{ 
		int c = a+b;
		System.out.println("Sum is  = "+c);
		return c;
	}
	public int Sub(int p, int q)
	{
		int r = p-q;
		System.out.println("Sub is  = "+r);
		return r;
	}
	public void Mul(int x, int y)
	{
		int z = x*y;
		System.out.println("final result is  = " +z);
	}
	public static void main(String[] args) 
	{
	Assing ab = new Assing();
	int Sum_result = ab.Sum(10, 2);
	int Sub_result = ab.Sub(10, 2);
	ab.Mul(Sum_result, Sub_result);
	
	}
	
}
