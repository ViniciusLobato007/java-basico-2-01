package exercicio2_01.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

import exercicio2_01.entities.Candidato;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		Scanner scan = new Scanner(System.in);

		ArrayList<Candidato> contagem = new ArrayList<Candidato>();

		Candidato candidato1 = new Candidato("Joao", 0);
		Candidato candidato2 = new Candidato("Maria", 0);
		Candidato candidato3 = new Candidato("Jose", 0);
		Candidato candidato4 = new Candidato("Antonio", 0);
		Candidato candidato5 = new Candidato("Tiburssinho", 0);

		contagem.add(candidato1);
		contagem.add(candidato2);
		contagem.add(candidato3);
		contagem.add(candidato4);
		contagem.add(candidato5);

		System.out.println(contagem);
		int option = 0;

		do {

			System.out.println("Digite seu voto: ");
			option = scan.nextInt();
			
			switch (option) {
			case 1:
				candidato1.setVotos(1);
				break;

			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				break;

			default:
				System.out.println("Voto Inválido!");
				break;
			}

		} while (option != 0);

		System.out.println("Fim das Votações!");
	}
}
