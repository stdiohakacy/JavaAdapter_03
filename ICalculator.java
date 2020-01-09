package structual.Adapter._03;

public interface ICalculator {
	public double getArea(Rectangle rectangle);
}

class Calculator implements ICalculator{
	Rectangle rectangle;
	@Override
	public double getArea(Rectangle rectangle) {
		this.rectangle = rectangle;
		return this.rectangle.length * this.rectangle.width;
	}
	
}