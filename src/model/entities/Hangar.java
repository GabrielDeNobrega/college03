package model.entities;

public abstract class Hangar {

	private Integer id;

	public Hangar() {

	}

	public Hangar(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void addAirship() {

	}

	public void removeAirship() {

	}

}
