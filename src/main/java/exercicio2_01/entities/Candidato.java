package exercicio2_01.entities;

public class Candidato {

	private int id;
	private String name;
	private int numeroDeVotos;

	public Candidato() {

	}

	public Candidato(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void adicionarVoto() {
		this.numeroDeVotos += 1;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumeroDeVotos() {
		return numeroDeVotos;
	}

}
