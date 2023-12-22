package MathClass;

import org.testng.annotations.Test;

public class Math_Random 
{
	@Test
	public void Testcase1()
	{
		for ( int i=0; i<=1000; i++)
		{
			System.out.println(Math.random());
		}
	}
}
