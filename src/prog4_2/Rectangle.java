package prog4_2;

public final class Rectangle extends ClosedCurve {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}

	@Override
	public double computeArea() {
		return length * width;
	}

}
