import java.util.Scanner;

public class DollarToRupee {

	public static void main(String[] args) {

		float dollars;

		Scanner in = new Scanner(System.in);

		System.out.println("Please enter dollars:");

		dollars = in.nextLong();

		float rupees = dollars * 64;

		System.out.println(rupees + " Rupees");

	}
}