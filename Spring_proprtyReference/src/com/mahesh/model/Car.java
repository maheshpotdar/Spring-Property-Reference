package com.mahesh.model;

public class Car {
	// primitive variable object malacha tayar karav lagnar.
	private String carname;
	private String carmodelyear;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carname, String carmodelyear) {
		super();
		this.carname = carname;
		this.carmodelyear = carmodelyear;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarmodelyear() {
		return carmodelyear;
	}

	public void setCarmodelyear(String carmodelyear) {
		this.carmodelyear = carmodelyear;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + ", carmodelyear=" + carmodelyear + "]";
	}

}
