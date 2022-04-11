package controle;

import entities.Aeroporto;

public class Radar extends TorreDeControle {

	private String condicaoClimatica;

	public Radar() {

	}

	public Radar(String condicaoClimatica) {
		this.condicaoClimatica = condicaoClimatica;
	}

	public String getCondicaoClimatica() {
		return condicaoClimatica;
	}

	public void setCondicaoClimatica(String condicaoClimatica) {
		this.condicaoClimatica = condicaoClimatica;
	}
	
	public Radar[] criaCondicoesClimaticas() {

		Radar[] radar = new Radar[3];

		radar[0] = new Radar("Ensolarado");
		radar[1] = new Radar("Chuvoso");
		radar[2] = new Radar("Neblina");

		return radar;

	}

}
