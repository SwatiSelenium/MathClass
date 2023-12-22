package MathClass;

import org.testng.annotations.Test;

public class Math_class 
{
	@Test
	public void scenerio1()
	{
		double x = Math.PI;
		System.out.println(x);
		System.out.println(Math.addExact(45, 98));
		System.out.println(Math.subtractExact(78, 87));
		System.out.println(Math.multiplyExact(40, 3));
		System.out.println(Math.max(23.5, 89.4));
		System.out.println(Math.random());
	}
}
