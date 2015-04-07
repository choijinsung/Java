public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();
		
		cal.compute("+", 30);
		double value = cal.getResult();
		System.out.println("value is " + value);
		
		cal.compute("/", 24);
		value = cal.getResult();
		System.out.println("value is " + value);
		
		cal.compute("*", 2);
		value = cal.getResult();
		System.out.println("value is " + value);
		
		cal.compute("-", 1.5);
		value = cal.getResult();
		System.out.println("value is " + value);
	}
}

class Calculator
{
	private double result;
	public Calculator()
	{
		result = 0;
	}
	public double getResult()
	{
		return result;
	}
	public void compute(String op, double arg)
	{
		if(op.equals("+"))
		{
			result = result + arg;
		}
		else if(op.equals("-"))
		{
			result = result - arg;
		}
		else if(op.equals("*"))
		{
			result = result * arg;
		}
		else if(op.equals("/"))
		{
			if(arg!=0)
			{
				result = result / arg;
			}
		}
	}
}
