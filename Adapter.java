package structual.Adapter._03;

public class Adapter implements ICalculator {
	Calculator calc;
	Triangle triangle;

	public Adapter(Triangle triangle) {
		this.triangle = triangle;
	}

	@Override
	public double getArea(Rectangle r) {
		calc = new Calculator();
		Rectangle rectangle = new Rectangle();
		rectangle.length = triangle.base;
		rectangle.width = 0.5 * triangle.height;

		return calc.getArea(rectangle);
	}

}
