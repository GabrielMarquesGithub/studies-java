package classes;

public class User {
	String name;
	String email;

	User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//Sobrepondo o equals padrão com um método de comparação próprio
	public boolean equals(Object obj) {
		if(obj instanceof User) {
			User externalUser = (User) obj;
			
			boolean nomeIgual = externalUser.name.equals(this.name);
			boolean emailIgual = externalUser.email.equals(this.email);

			return nomeIgual && emailIgual;
		}
		return false;
	}
}
