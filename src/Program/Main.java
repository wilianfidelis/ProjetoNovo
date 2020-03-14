package Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("QUal o horario: ");
		hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia senhor");
		}
		else if (hora <= 18) {
			System.out.println("Boa tarde Senhor");
		}
		else {
			System.out.println("Boa noite senhor ");
		}

		sc.close();

	}

}
