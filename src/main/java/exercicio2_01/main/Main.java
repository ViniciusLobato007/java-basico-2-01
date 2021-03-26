package exercicio2_01.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import exercicio2_01.entities.Candidato;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private Map<Integer, Candidato> mapaDeCandidatos = new HashMap<Integer, Candidato>();

	private void start() {

		inicializarMapaDeCandidatos();

		while (true) {

			int voto = obterVoto();

			if (voto == 0) {

				break;
			}

			System.out.println("Número do voto: " + voto);

			registrarVoto(voto);
		}

		apurarVotos();

		System.out.println("Finalizando aplicação...");

	}

	private void apurarVotos() {

		List<Candidato> candidatos = new ArrayList<Candidato>();

		for (Candidato candidato : mapaDeCandidatos.values()) {

			candidatos.add(candidato);
		}

		candidatos.sort((a, b) -> {
			return b.getNumeroDeVotos() - a.getNumeroDeVotos();
		});

		System.out.println("Qntd de votos do Candidato 1: " + candidatos.get(0).getNumeroDeVotos());
		System.out.println("Qntd de votos do Candidato 2: " + candidatos.get(1).getNumeroDeVotos());
		System.out.println("Qntd de votos do Candidato 3: " + candidatos.get(2).getNumeroDeVotos());
		System.out.println("Qntd de votos do Candidato 4: " + candidatos.get(3).getNumeroDeVotos());
		System.out.println("Qntd de votos do Candidato 5: " + candidatos.get(4).getNumeroDeVotos());

//		Neste trecho será feito a identificação de empate
		List<Candidato> candidatosEmpatados = new ArrayList<Candidato>();

		int index = 0;
		int j = 0;

		for (Candidato candidato : candidatos) {
			if (candidatos.get(index + j).getNumeroDeVotos() == candidatos.get(index).getNumeroDeVotos()) {

				System.out.println("Candidato " + (index + j) + " igual ao Candidato " + index);
				j++;
				candidatosEmpatados.addAll(candidatos);
			}
		}

//		Trecho de vizualização dos candidatos empatados
		index = 0;

		for (Candidato candidato : candidatosEmpatados) {
			System.out.println(candidatosEmpatados.get(index).getName());
		}

//		Esse bloco exibe e ordena os candidatos

		Candidato candidatoEleito = candidatos.get(0);

		System.out.println("\nO Candidato eleito é o " + candidatoEleito.getName() + " com, "
				+ candidatoEleito.getNumeroDeVotos() + " votos!");

		for (int i = 0; i < candidatos.size(); i++) {
			int posicao = i + 1;
			Candidato candidato = candidatos.get(i);
			System.out.println("Lugar " + posicao + " candidato " + candidato.getName() + " - "
					+ candidato.getNumeroDeVotos() + " votos!");
		}
	}

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "Joao");
		mapaDeCandidatos.put(joao.getId(), joao);

		Candidato maria = new Candidato(2, "maria");
		mapaDeCandidatos.put(maria.getId(), maria);

		Candidato tiburssinho = new Candidato(3, "tiburssinho");
		mapaDeCandidatos.put(tiburssinho.getId(), tiburssinho);

		Candidato miguel = new Candidato(4, "MiguelMaluco");
		mapaDeCandidatos.put(miguel.getId(), miguel);

		Candidato monstralvao = new Candidato(5, "Malvadao");
		mapaDeCandidatos.put(monstralvao.getId(), monstralvao);
	}

	private int obterVoto() {

		System.out.println("Digite seu voto: ");
		Scanner scan = new Scanner(System.in);

		try {
			return scan.nextInt();

		} catch (Exception e) {
			scan.next();

			System.out.println("Valor inválido!");
			return -1;
		}

	}

	private void registrarVoto(int voto) {

//		NOME_MAPA.contaisKey(CHAVE_EM_QUESTAO);
//		NOME_MAPA.get(CHAVE_EM_QUESTAo);

		if (mapaDeCandidatos.containsKey(voto)) {

			Candidato candidato = mapaDeCandidatos.get(voto);

			candidato.adicionarVoto();

			System.out.println("Você votou em " + candidato.getName() + ".");

		} else {
			System.out.println("Desculpe, porém este candidato(a) não existe. Tente novamente!");
		}

	}
}
