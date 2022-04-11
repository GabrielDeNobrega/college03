package voo;

public class Trajeto extends Voo{

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

	public Trajeto[] criaTrajetos() {

		Trajeto[] routes = new Trajeto[10];

		routes[0] = new Trajeto(111, "São Paulo", "Rio de Janeiro");
		routes[1] = new Trajeto(112, "Rio de Janeiro", "São Paulo");
		routes[2] = new Trajeto(113, "Araraquara", "Ubatuba");
		routes[3] = new Trajeto(114, "Campinas", "Rio de Janeiro");
		routes[4] = new Trajeto(115, "Sorocaba", "Barretos");
		routes[5] = new Trajeto(116, "São Paulo", "São Carlos");
		routes[6] = new Trajeto(117, "Rio de Janeiro", "Sorocaba");
		routes[7] = new Trajeto(118, "Campinas", "Ubatuba");
		routes[8] = new Trajeto(119, "São Paulo", "Manaus");
		routes[9] = new Trajeto(120, "Rio de Janeiro", "Manaus");

		return routes;

	}

	@Override
	public String toString() {
		return "Voo: " + id + " Origem: " + origem + " Destino: " + destino;
	}

}
