package package1;

public class Express1 {
	//Solving the expression 
	// (((((10+2)+2)-2)*2)/2)

	public int Sum(int a, int b)
	{
		int c = a+b;
		System.out.println("The result of Sum is  = "+c  );
        return c;
	}
	public int Sub(int d, int e)
	{
		int f = d-e;
		System.out.println("The result of Sub is  = " +f);
		return f;
	}
    public int Mul(int g, int h)
    {
    	int i = g*h;
    	System.out.println("The result of Mul is = " +i);
    	return i;
    }
    public void Div(int p, int q)
    {
    	int r= p/q;
    	System.out.println("The Final answer is   = "+r);
    }
    public static void main(String[] args) {
	Express1 ob1 = new Express1();	
	int Sum_result = ob1.Sum(10, 2);
	int Sum2_result = ob1.Sum(Sum_result, 2);
	int Sub_result = ob1.Sub(Sum2_result, 2);
	int Mul_result = ob1.Mul(Sub_result, 2);
	ob1.Div(Mul_result, 2);
	}
}