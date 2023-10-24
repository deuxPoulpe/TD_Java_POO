package GemsSafe;

public class Gemstone {
	
	private double value;
	private double valuePerMc;
	private final double volume;
	private Safe safe;
	
	
	public Gemstone(double myVolume) {
		this.volume = myVolume;
		this.valuePerMc = 1;
	}
	
	//Getters
	
	public Safe getMySafe() {
		return this.safe;
	}
	
	public double getMyValue() {
		return this.value;
	}
	
	public double getMyVolume() {
		return this.volume;
	}
	
	public double getMyValuePerMc() {
		return this.valuePerMc;
	}
	
	public void setMyValuePerMc(double new_value) {
		this.valuePerMc = new_value;
	}
	
	public void setMySafe(Safe new_safe) {
		this.safe = new_safe;
	}
	
	public void appraisal() {
		this.value = this.valuePerMc * this.volume; 	
	}
	
	

}
