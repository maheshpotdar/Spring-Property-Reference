package com.mahesh.model;

public class Employee {

	// 2 primitive ani 1 secondary variable.
	// class madhe 1 jari primitive variable asel tar object malacha tayara karav
	// lagnar.

	private String empname;
	private String empaddress;

	private Car car;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Employee(String empname, String empaddress, Car car) {
		super();
		this.empname = empname;
		this.empaddress = empaddress;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empaddress=" + empaddress + ", carName =" + car.getCarname()
				+ "car Modelyear =" + car.getCarmodelyear() + "]";
	}

}
