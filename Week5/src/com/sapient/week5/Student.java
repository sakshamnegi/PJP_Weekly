package com.sapient.week5;

public class Student {

	private int id;
	private String name, city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {

	}

	@Override
	public String toString() {
		CustomHelper.builder.setLength(0);
		CustomHelper.builder.append("[ Id = ");
		CustomHelper.builder.append(id);
		CustomHelper.builder.append(", Name = ");
		CustomHelper.builder.append(name);
		CustomHelper.builder.append(", City = ");
		CustomHelper.builder.append(city);
		CustomHelper.builder.append(" ]");
		return CustomHelper.builder.toString();
	}

}
