/**
 * 
 */
package com.classroom.day1.entity;

import java.util.Objects;

/**
 * 
 */
public class Dog {
	private String name;
	private String color;
	private Double height;
	private Double weight;
	private Boolean isFriendly;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getHeight() {
		return height;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getWeight() {
		return weight;
	}
	public void setWeight(Double weight) {
		this.weight = weight;
	}
	public Boolean getIsFriendly() {
		return isFriendly;
	}
	public void setIsFriendly(Boolean isFriendly) {
		this.isFriendly = isFriendly;
	}
	@Override
	public String toString() {
		//this is not mandatory..
		return "Hello, I am " + this.name + " and I like " + this.color + " color.";
	}
	@Override
	public int hashCode() {
		return Objects.hash(isFriendly, weight);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
	/*	if (getClass() != obj.getClass())
			return false;*/
		Dog other = (Dog) obj;
		//return ((this.getIsFriendly() == other.getIsFriendly())&& (this.getWeight() == other.getWeight()));
		return Objects.equals(isFriendly, other.isFriendly) && Objects.equals(weight, other.weight);
	}
	public Dog(String name, String color, Double height, Double weight, Boolean isFriendly) {
		super();
		this.name = name;
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.isFriendly = isFriendly;
	}
	
	
}
