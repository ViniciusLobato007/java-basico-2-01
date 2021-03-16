package exercicio2_01.main;

import java.util.HashMap;
import java.util.Map;

import exercicio2_01.entities.Candidato;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private Map<Integer, Candidato> mapaDeCandidato = new HashMap<Integer, Candidato>();

	private void start() {

		inicializarMapaDeCandidatos();
	}

	private void inicializarMapaDeCandidatos() {

		Candidato joao = new Candidato(1, "Joao");
		mapaDeCandidato.put(joao.getId(), joao);

		Candidato maria = new Candidato(2, "maria");
		mapaDeCandidato.put(maria.getId(), maria);

		Candidato tiburssinho = new Candidato(3, "tiburssinho");
		mapaDeCandidato.put(tiburssinho.getId(), tiburssinho);

		Candidato miguel = new Candidato(4, "MiguelMaluco");
		mapaDeCandidato.put(miguel.getId(), miguel);

		Candidato monstralvao = new Candidato(5, "Malvadao");
		mapaDeCandidato.put(monstralvao.getId(), monstralvao);
	}

}
