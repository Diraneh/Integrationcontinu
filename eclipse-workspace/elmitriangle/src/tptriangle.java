
public class tptriangle {

	private double l1, l2, l3;

	public tptriangle(double a, double b, double c) {

		l1 = a;

		l2 = b;

		l3 = c;
	}

	public trianglgenum getType() {

		if (l1 == l2 && l2 == l3) {
			return trianglgenum.Equilateral;

		}

		if (l1 == l2 && l2 != l3 && l3 != l1) {
			return trianglgenum.Isoceles;

		}

		if (l1 != l2 && l2 != l3 && l3 != l1) {
			return trianglgenum.scalene;

		}

		if (l1 <= 0 && l1 != l2 && l2 != l3) {
			return trianglgenum.invalid;

		}

		else {
			return trianglgenum.rectangle;
		}

	}
}
