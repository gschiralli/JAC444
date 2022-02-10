package shapes;

public class Triangle implements Shape{
	
	private double sideA,sideB,sideC;
	
	public Triangle(final double sideA ,final double sideB,final double sideC) throws Exception
	{
		if(sideA < 0 || sideB < 0 || sideC < 0 || (sideA > sideB + sideC) ||(sideB > sideA + sideC) ||(sideC > sideB + sideA) )
		{
			throw new Exception("Invalid side(s)");
		}
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	
	public double getSideA()
	{
		return sideA;
	}
	
	public void setSideA(final double a)
	{
		this.sideA = a;
	}
	
	public double getSideB()
	{
		return sideB;
	}
	
	public void setSideB(final double b)
	{
		this.sideB = b;
	}
	
	public double getSideC()
	{
		return sideC;
	}
	
	public void setSideC(final double c)
	{
		this.sideC = c;
	}
	
	@Override
	public String toString() {
		return String.format("%s {s1=%.1f, s2=%.1f,s3=%.1f}\n", this.getClass().getSimpleName(), this.getSideA(), this.getSideB(),this.getSideC());
	}
	
	
	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return sideA + sideB + sideC;
	}

}
