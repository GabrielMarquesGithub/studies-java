package collections;

import java.util.ArrayList;

public class CollectionHashList {
	public static void main(String[] args) {
		ArrayList<Usuario> UsersList = new ArrayList<>();

		for (int i = 0; i < 15; i++) {
			UsersList.add(new Usuario(String.format("User %d", i + 1)));
		}

		System.out.println("Todos os usuarios");
		for (Usuario user : UsersList) {
			System.out.println(user);
		}

		System.out.println("");
		System.out.println("Usuario escolhido");

		Usuario currentUser = new Usuario("User 15");

		// o indexOf retorna o index do objeto comparado pelo equals
		int userIndex = UsersList.indexOf(currentUser);

		if (userIndex == -1) {
			System.out.println("Usuario não existe");
		} else {
			// o método get 'pega' um item baseado no index passado a ele
			boolean userEquals = currentUser.equals(UsersList.get(userIndex));
			System.out.println("Os usuarios são iguais? " + userEquals);
		}

		// na list o remove funciona tanto passando um objeto igual que será ocmparado
		// pelo equals ou passando o index do item na list

		// retorna boolean como o do hashset
		UsersList.remove(new Usuario("User 15"));
		// retorna o objeto removido
		UsersList.remove(11);

	}
}
