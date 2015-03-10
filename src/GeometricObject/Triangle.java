package GeometricObject;

public class Triangle extends GeometricObject{

	double side1 = 1;
	double side2 = 1;
	double side3 = 1;
	
	public Triangle(){
		
	}
	public Triangle(double side1, double side2, double side3) {
		this.side1= side1;
		this.side2= side2;
		this.side3= side3;
		
		
	}
	public double setside1() {
		return side1;
				
	}
	public double setside2() {
		return side2;
		
	}
	public double setside3() {
		return side3;
		
	}
	public void setside1(double side1)
	{
		this.side1= side1;
				
	}
	public void setside2(double side2)
	{
		this.side2= side2;
				
	}
	public void setside3(double side3)
	{
		this.side3= side3;
	}
	public double getArea()
	{
		return (side1+side2+side3)/2;
		
	}
	public double getPerimeter()
	{
		return (side1+side2+side3);
		
	}
	public String toString()
	{
		return "the three sides of the triangle are: side 1 =" + side1 + "side 2 = " + side2 + "side 3 = " + side3;
		
	}
}	
	

