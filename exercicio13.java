package loopings;
import java.util.Scanner;
public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int num = input.nextInt();
			
		if (num % 2 == 0) {
			num = num / 2;
		} else {
			num = 3 * num + 1;
		} System.out.println(num);
	}

}
