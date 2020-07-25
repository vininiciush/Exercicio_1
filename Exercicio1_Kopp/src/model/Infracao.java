package model;

public class Infracao {
	
	private Integer number;
	
	private Float value;
	
	public Infracao() {
		
	}
	
	public Infracao(Integer number, Float value) {
		super();
		this.number = number;
		this.value = value;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
