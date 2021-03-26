package exercicio2_01.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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

		/*
		 * Neste trecho será feito a identificação de empate
		 */
		
		List<Candidato> candidatosEmpatados = new ArrayList<Candidato>();
		
		for (Candidato candidato : candidatos) {
			if(candidatos.get(1).getNumeroDeVotos() != candidatos.get(2).getNumeroDeVotos()) {
//				Terminar trecho
			}
		}
		
		/*
		 * Esse bloco exibe e ordena os candidatos
		 */
		Candidato candidatoEleito = candidatos.get(0);

		System.out.println("O Candidato eleito é o " + candidatoEleito.getName() + " com, "
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
