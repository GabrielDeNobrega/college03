package controle;

public class TorreDeControle {

	private Integer id;
	private Integer numeroControladores;

	public TorreDeControle() {
;
	}

	public TorreDeControle(Integer id, Integer numeroControladores) {
		this.id = id;
		this.numeroControladores = numeroControladores;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumeroControladores() {
		return numeroControladores;
	}

	public void setNumeroControladores(Integer numeroControladores) {
		this.numeroControladores = numeroControladores;
	}
	
	public void definirAeroporto() {
		System.out.println("*********** Olá, Controlador(a)!");
		System.out.println("*********** Vamos definir as informações sobre o aeroporto.");
		
		System.out.println("Qual é o aeroporto em que você está ?");
		
		}

}
