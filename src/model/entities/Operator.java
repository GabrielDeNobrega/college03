package model.entities;

import model.enums.ManeuverType;

public class Operator {

	private Integer id;
	private String name;

	public Operator() {

	}

	public Operator(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void putOnHold() {

	}

	public ManeuverType transmitLandingProcedure() {
		return null;
	}

	public ManeuverType transmitTakeOffProcedure() {
		return null;
	}

	public void searchAvailableAirports() {

	}

}
