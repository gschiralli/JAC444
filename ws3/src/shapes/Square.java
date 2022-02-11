package shapes;

public class Square extends Rectangle{
	
	public Square(final double side) throws Exception
	{
		super(side,side);
	}
	
	@Override
	public String toString() {
		return String.format( "%s {s=%s} perimeter = %.4f\n", 
				this.getClass().getSimpleName(), 
				this.getWidth(),
				this.perimeter());
	}
	
	@Override
	public double perimeter()
	{
		return 4 * this.getWidth();
	}

}
