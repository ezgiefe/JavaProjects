package ikincivize;
//aslında q1 

class Shape{
	private String type;
    private double radius;
    private double length;
    private double width;
    private double base;
    private double height;
    
    public Shape(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }

    public Shape(String type, double length, double width) {
        this.type = type;
        this.length = length;
        this.width = width;
    }
    

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double totalArea()
    public double calculateTotalArea() {
    	double totalarea= 0;
    	
    	 for (Shape shape : shapes) {

             if (shape.getType().equals("circle")) {

                 totalArea += 3.14 * Math.pow(shape.getRadius(), 2);

             } else if (shape.getType().equals("rectangle")) {

                 totalArea += shape.getLength() * shape.getWidth();

             } else if (shape.getType().equals("triangle")) {

                 totalArea += (shape.getBase() * shape.getHeight()) / 2;

             }

         }
    }

}


public class q2 {

	public static void main(String[] args) {

		
	}

}
