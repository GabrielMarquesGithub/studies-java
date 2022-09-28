package erros;

public class ChecadaVsNaoChecada {
	public static void main(String[] args) {
		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim !!");
	}

	// uma RuntimeException mesmo lançando um erro não o briga o seu tratamento
	static void geraErro1() {
		throw new RuntimeException("Erro 01");
	}

	// uma exceção checada é quando a a obrigatoriedade de tratamento
	// ao se trabalha com esse tipo de exceção deve-se tratar ela ou a lançar para o
	// próximo escopo
	static void geraErro2() throws Exception {
		throw new Exception("Erro 02");
	}
}
