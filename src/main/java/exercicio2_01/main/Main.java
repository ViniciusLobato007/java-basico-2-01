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

		int option = 0, i = 0;
		;

		do {

			System.out.println("Digite seu voto: ");
			option = scan.nextInt();

			switch (option) {
			case 1:
				i = candidato1.getVotos();
				candidato1.setVotos(i++);

				System.out.println(i);
				break;

			case 2:
				i = candidato2.getVotos();
				candidato1.setVotos(i++);
				break;

			case 3:
				i = candidato3.getVotos();
				candidato1.setVotos(i++);
				break;

			case 4:
				i = candidato4.getVotos();
				candidato1.setVotos(i++);
				break;

			case 5:
				i = candidato5.getVotos();
				candidato1.setVotos(i++);
				break;

			default:
				System.out.println("Voto Inválido!");
				break;
			}

		} while (option != 0);

		System.out.println("Fim das Votações!");
	}
}
