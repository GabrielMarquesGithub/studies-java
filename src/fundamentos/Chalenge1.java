package fundamentos;

public class Chalenge1 {
	public static void main(String[] args) {
		float x = (float) Math.pow(6 * (3 + 2), 2);
		float y = ((1 - 5) * (2 - 7));
		x = x / (3 * 2);
		y = (float) Math.pow((y / 2), 2);
		float response = (float) Math.pow((x - y), 3);
		response = (float) (response / Math.pow(10, 3));

		System.out.println(response);
	}
}
