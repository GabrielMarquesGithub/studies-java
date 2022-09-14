package collections;

import java.util.Stack;

public class CollectionHashStack {
	public static void main(String[] args) {
		// se o tipo usado for deque será
		Stack<Usuario> fila = new Stack<Usuario>();

		for (int i = 0; i < 15; i++) {
			// as stacks podem ter um tamanho pré determinado
			// o push substitui o add nas stacks ele retorna erro se pilha estiver cheia
			// o add se utilizado em uma queue cheia retorna uma exceção (erro)
			// uma queue cheia
			fila.add(new Usuario(String.format("User %d", i + 1)));
		}

		System.out.println("Todos os usuarios");
		for (Usuario user : fila) {
			System.out.println(user);
		}

		System.out.println("");
		System.out.println("Os items achados ");
		// existem dois métodos para pagar elementos das filas, eles sempre pegam o
		// primeiro elemento
		// os métodos são peek() e o element()

		// retorna null casa a lista esteja vazia
		System.out.println(fila.peek());

		System.out.println(fila.pop());// retorna erro se a pilha estiver vazia
		System.out.println(fila.pop());// retorna erro se a pilha estiver vazia
		System.out.println(fila.pop());// retorna erro se a pilha estiver vazia

	}
}
