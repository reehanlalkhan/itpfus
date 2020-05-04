
public class DayOneAssignment {
	public static void main(String args[]) {
		int count = 0;
		while (count < 10) {
			count++;
			double d = Math.random();
			if (d < 0.1) {
				System.out.println("My Song one");
			} else if (d < 0.2) {
				System.out.println("My Song Two");
			} else {
				System.out.println("No Song");
			}
		}
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
	}
}
