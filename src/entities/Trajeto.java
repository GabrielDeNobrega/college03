package entities;

public class Trajeto {

	private Integer id;
	private String origem;
	private String destino;

	public Trajeto() {

	}

	public Trajeto(Integer id, String origem, String destino) {
		this.id = id;
		this.origem = origem;
		this.destino = destino;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	@Override
	public String toString() {
		return "Voo: " 
				+ id 
				+ " Origem: " 
				+ origem 
				+ " Destino: " 
				+ destino;
	}

}
