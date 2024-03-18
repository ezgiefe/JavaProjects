package acm321w10;

 abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	 abstract double getArea();
	 abstract double getPerimeter();
	

}
