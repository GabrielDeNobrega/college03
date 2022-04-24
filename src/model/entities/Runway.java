package model.entities;

public abstract class Runway {

	private Integer id;
	private Double length;

	public Runway() {
		
	}

	public Runway(Integer id, Double length) {
		this.id = id;
		this.length = length;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

}
