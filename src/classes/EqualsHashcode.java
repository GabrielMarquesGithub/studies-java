package classes;

public class EqualsHashcode {

	public static void main(String[] args) {
		User u1 = new User("Gabriel", "@gmail");
		User u2 = new User("Gabriel", "@gmail");

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));

	}
}
