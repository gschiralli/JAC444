package shapes;

public class Circle implements Shape {

	private double radius;
	public ShapeArea area;
	
	public Circle(final double radius) throws Exception
	{
		//throws error if radius is negative
		if(radius < 0)
		{
			throw new Exception("Invalid radius!");
		}
		this.radius = radius;
		area = () -> this.radius * this.radius * Math.PI;
		
	}
	
	
	public double getRadius() {
		
		return radius;
	}
	
	
	public void setRadius(final double radius) {
		
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		
		return String.format("%s {r=%.1f} perimeter = %.5f area = %.5f", 
				this.getClass().getSimpleName(),
				this.getRadius(),
				this.perimeter(),
				area.getArea());
	}
	
	@Override
	public double perimeter() {
		
		return 2*Math.PI*getRadius();
	}
	

}
