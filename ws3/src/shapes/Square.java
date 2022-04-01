package shapes;

public class Square extends Rectangle{
	
	public ShapeArea area;
	public Square(final double side) throws Exception
	{
		super(side,side);
		
		area = () -> getWidth() * getHeight();
	}
	
	@Override
	public String toString() {
		return String.format( "%s {s=%s} perimeter = %.4f area = %.4f", 
				this.getClass().getSimpleName(), 
				this.getWidth(),
				this.perimeter(),
				area.getArea());
	}
	
	@Override
	public double perimeter()
	{
		return 4 * this.getWidth();
	}

}
