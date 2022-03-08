package shapes;

public class Circle implements Shape {

	private double radius;
	
	public Circle(final double radius) throws Exception
	{
		//throws error if radius is negative
		if(radius < 0)
		{
			throw new Exception("Invalid radius!");
		}
		this.radius = radius;
	}
	
	
	public double getRadius() {
		
		return radius;
	}
	
	
	public void setRadius(final double radius) {
		
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s {r=%.1f} perimeter = %.5f", 
				this.getClass().getSimpleName(),
				this.getRadius(),
				this.perimeter());
	}
	
	@Override
	public double perimeter() {
		
		return 2*Math.PI*getRadius();
	}
	

}
