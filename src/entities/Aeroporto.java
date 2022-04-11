package entities;

public class Aeroporto {

	private Integer id;
	private String nomeAeroporto;
	private Integer numeroPistas;
	private Integer numeroTerminais;
	private Integer numeroHangares;

	public Aeroporto() {

	}

	public Aeroporto(Integer id, String nomeAeroporto, Integer numeroPistas, Integer numeroTerminais,
			Integer numeroHangares) {
		this.id = id;
		this.nomeAeroporto = nomeAeroporto;
		this.numeroPistas = numeroPistas;
		this.numeroTerminais = numeroTerminais;
		this.numeroHangares = numeroHangares;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroPistas() {
		return numeroPistas;
	}

	public void setNumeroPistas(Integer numeroPistas) {
		this.numeroPistas = numeroPistas;
	}

	public Integer getNumeroTerminais() {
		return numeroTerminais;
	}

	public void setNumeroTerminais(Integer numeroTerminais) {
		this.numeroTerminais = numeroTerminais;
	}

	public Integer getNumeroHangares() {
		return numeroHangares;
	}

	public void setNumeroHangares(Integer numeroHangares) {
		this.numeroHangares = numeroHangares;
	}

	public Aeroporto[] criaAeroportos() {

		Aeroporto[] airport = new Aeroporto[10];

		airport[0] = new Aeroporto(101, "Guarulhos", 2, 3, 5);
		airport[1] = new Aeroporto(102, "Congonhas", 1, 2, 4);
		airport[2] = new Aeroporto(103, "Santos Dumont", 2, 2, 6);
		airport[3] = new Aeroporto(104, "Rio Galeão", 3, 4, 3);
		airport[4] = new Aeroporto(105, "Viracopos", 1, 3, 5);
		airport[5] = new Aeroporto(106, "Araraquara", 1, 2, 4);
		airport[6] = new Aeroporto(107, "São Carlos", 2, 2, 6);
		airport[7] = new Aeroporto(108, "Ubatuba", 1, 1, 2);
		airport[8] = new Aeroporto(109, "Barretos", 2, 3, 2);
		airport[9] = new Aeroporto(110, "Sorocaba", 1, 1, 2);

		return airport;

	}
	
	@Override
	public String toString() {
		return "Id: " 
				+ id 
				+ " ---- Nome: " 
				+ nomeAeroporto 
				+ " ---- Pistas: " 
				+ numeroPistas 
				+ " ---- Terminais: " 
				+ numeroTerminais 
				+ " ---- Hangares: "
				+ numeroHangares;
	}

}
