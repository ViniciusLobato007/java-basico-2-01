package exercicio2_01.entities;

public class Candidato {

	private String id;
	private String name;
	private Integer votos;

	public Candidato(String name, Integer votos) {
		this.name = name;
		this.votos = votos;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

}
