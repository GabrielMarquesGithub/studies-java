package collections;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionHashQueue {
	public static void main(String[] args) {
		Queue<Usuario> fila = new LinkedList<>();

		for (int i = 0; i < 15; i++) {
			// as queues podem ter um tamanho pré determinado
			// o offer substitui o add nas queues
			// o add se utilizado em uma queue cheia retorna uma exceção (erro)
			// já o offer retorna um boolean false caso usando para adicionar um item a
			// uma queue cheia
			fila.offer(new Usuario(String.format("User %d", i + 1)));
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

		// as diferenças dos métodos esta nas respostas quando a lista esta vazia
		// retorna null casa a lista esteja vazia
		System.out.println(fila.peek());
		// retorna uma exceção (erro)
		System.out.println(fila.element());

		// método de pegar o primeiro elemento e já o remover
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());// se a lista estiver vazia retorna null
		// o remove faz a mesma coisa porem lança um erro se a fila estiver vazia
		System.out.println(fila.remove());

	}
}
