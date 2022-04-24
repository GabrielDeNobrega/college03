package model.entities;

public class Terminal {

	private Integer id;
	private Character identificationLetter;

	public Terminal() {

	}

	public Terminal(Integer id, Character identificationLetter) {
		this.id = id;
		this.identificationLetter = identificationLetter;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getIdentificationLetter() {
		return identificationLetter;
	}

	public void setIdentificationLetter(Character identificationLetter) {
		this.identificationLetter = identificationLetter;
	}

}
