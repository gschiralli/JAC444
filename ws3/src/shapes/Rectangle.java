package shapes;

//Implements our shape interface
public class Rectangle implements Shape{
	
	private double height;
	private double width;
	public ShapeArea area;
	
	public Rectangle(final double width,final double height) throws Exception
	{
		//Throws error if negative value
		if(width < 0 || height < 0)
		{
			throw new Exception("Invalid side!");
		}
		this.setHeight(height);
		this.setWidth(width);
		area = () -> getWidth() * getHeight();
	}
	
	
	//Height getter and setter
	public double getHeight() {
		return height;
	}


	public void setHeight(final double height) {
		this.height = height;
	}


	//Width getter and setter
	public double getWidth() {
		return width;
	}


	public void setWidth(final double width) {
		this.width = width;
	}
	
	//Override toString method
	@Override
	public String toString() {
		return String.format("%s {w=%.1f, h=%.1f} perimeter = %.4f area = %.4f",
				this.getClass().getSimpleName(), 
				this.getWidth(), 
				this.getHeight(),
				this.perimeter(),
				area.getArea());
	}

	//implement interface method
	@Override
	public double perimeter() {
		return 2 * (this.getWidth() + this.getHeight());
	}
}
