package fundamentos;

//import bigDecimal
import java.math.BigDecimal;

//import de JOption
import javax.swing.JOptionPane;

public class ConversaoTiposCast {
	public static void main(String[] args) {
		// para conversões implícitas o JAVA não acusa nenhum erro
		byte x = 127;
		int z = x; // o int naturalmente comporta mais que um byte

		System.out.println(z);

		// já conversões explicitas o JAVA acusa erro
		int a = 1000;
		byte b = (byte) a; // para conversões onde é possível que o numero convertido
		// seja maior que o comportado pelo tipo é necessário realizar o cast de tipo

		System.out.println(b);

		System.out.println("\n\n");
		// conversões de string e number
		Integer num = 1000;

		//conversões para string
		System.out.println(num.toString().length());
		System.out.println(Integer.toString(num).length());
		System.out.println(("" + num).length());

		System.out.println("\n\n");
		
		//usando um painel para obter valor
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número");

		//passando strings para double
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);

		//o bigDecimal é usado para trabalhar com extrema precisão
		//não é algo nativo, deve ser improtado para se utilizar
		BigDecimal soma = new BigDecimal(num1 + num2);

		System.out.println(soma);
	}
}
