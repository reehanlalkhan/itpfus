
public class StringExample {

	public static void main(String[] args) {
		String favCar = "FORD";

		String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "Bentle" };
		for (String car : cars) {
			System.out.println(car);
			if (car.equalsIgnoreCase(favCar)) {
				System.out.println("My Favorite car is present");
				break;
			}
		}

		int number = 5;
		switch (number) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("Number is odd");
			break;
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("Number is even");
			break;
		default:
			System.out.println("Number is not within range");
		}

	}

}
