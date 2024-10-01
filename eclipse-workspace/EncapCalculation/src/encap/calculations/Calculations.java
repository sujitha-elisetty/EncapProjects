package encap.calculations;

class Rectangle{
	private int width;
	private int length;
	public void setWidth(int width) {
		if(width>0) {
		this.width = width;
		}
		else {
			System.out.println("Enter the valid number");
		}
	}
	public int getWidth() {
		return width;
	}
	public void setLength(int length) {
		if(length>0) {
		this.length = length;
		}else {
			System.out.println("enter valid number");
		}
	}
	public int getLength() {
		return length;
	}
	int  calculateArea() {
		
	return length*width;
	}
	
}

public class Calculations {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setWidth(100);
		rect.setLength(200);
		System.out.println("print the length:"+rect.getWidth());
		System.out.println("print the length:"+rect.getLength());
		System.out.println("print the length:"+rect.calculateArea());
		

	}

}
