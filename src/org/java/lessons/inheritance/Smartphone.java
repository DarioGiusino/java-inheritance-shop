package org.java.lessons.inheritance;

public class Smartphone extends Prodotto {
	
	private String IMEI;
	private int memory;
	
	public Smartphone(String label, String brand, double price, int vat, String IMEI, int memory) {
		super(label, brand, price, vat);
		setIMEI(IMEI);
		setMemory(memory);
	}

	public String getIMEI() {
		return IMEI;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	@Override
	public String toString() {
		return super.getDescription()
				+ "\nCodice IMEI: " + getIMEI()
				+ "\nQuantità di memoria: " + getMemory() + "GB";
	}

}
