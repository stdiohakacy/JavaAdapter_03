package structual.Adapter._03;

public class Client {
	public static void main(String[] args) {
		Triangle triangle = new Triangle(10, 20);
		ICalculator calc = new Adapter(triangle);
		System.out.println(calc.getArea(null));
	}
}
