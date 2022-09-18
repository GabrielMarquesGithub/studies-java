package oo.coments.program;

import oo.coments.entities.Comment;
import oo.coments.entities.Post;

public class Program {
	public static void main(String[] args) {
		Post post1 = new Post("Titulo", "È um post feito para testes", 1);

		Comment comment1 = new Comment("Primeiro comentario");
		Comment comment2 = new Comment("Segundo comentario");

		post1.addComments(comment1);
		post1.addComments(comment2);

		System.out.println(post1.getComments());
	}
}
