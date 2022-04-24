package model.entities;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {

	private Integer id;
	private Radar radar;

	List<Operator> operators = new ArrayList<>();

	public ControlTower() {

	}

	public ControlTower(Integer id, Radar radar, List<Operator> operators) {
		this.id = id;
		this.radar = radar;
		this.operators = operators;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Radar getRadar() {
		return radar;
	}

	public void setRadar(Radar radar) {
		this.radar = radar;
	}

	public List<Operator> getOperators() {
		return operators;
	}

}
