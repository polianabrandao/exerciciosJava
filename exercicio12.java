package loopings;

public class exercicio12 {

	public static void main(String[] args) {
		int cont = 0;
		for (int num = 1; num <= 100; num ++) {
			if (num % 3 == 0) {
				System.out.print(num + " ");
				cont++;
			}
		
		}System.out.println("\n"+cont);

	}

}
