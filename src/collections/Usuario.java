package collections;

public class Usuario {
	String nome;

	Usuario(String nome) {
		this.nome = nome;
	}

	// ao sobrescrever o toString declaramos o que será exibido se tentarmos dar
	// print
	// no obj
	@Override
	public String toString() {
		return "Meu nome é " + this.nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	// os métodos de comparação das lists usam o equals personalizado também ao
	// comparar o objeto
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
