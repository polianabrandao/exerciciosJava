package loopings;
import java.util.Scanner;
public class exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala?");
		int qtd = entrada.nextInt();
		int cont = 0;
		double soma = 0;
		
		while (cont < qtd) {
			System.out.println("Digite a nota do aluno: ");
			double resp = entrada.nextDouble();
			soma = resp + soma;
			cont = cont + 1;
		}
		
		double media = soma / qtd;
		System.out.println(media);
	}

}
