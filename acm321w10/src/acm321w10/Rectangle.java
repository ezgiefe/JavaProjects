package acm321w10;

 class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle(String color, double width, double height) {
		Shape shape= new Shape();
		this.setWidth(width);
		this.setHeight(height);
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
