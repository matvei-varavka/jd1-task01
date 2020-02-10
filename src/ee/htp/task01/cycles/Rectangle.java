package ee.htp.task01.cycles;

public class Rectangle {
	
	float side1;
	float side2;
	
	public float area() {
		return side1 * side2;
	}
	
	public float perimeter() {
		return (side1 + side2) * 2;
	}
	
	public Rectangle(float side1, float side2) {
		this.side1 = side1;
		this.side2 = side2;
		
	}
	
	public Rectangle() {
		
	}
	

}
