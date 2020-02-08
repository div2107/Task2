package com.task2.gift;

public abstract class Sweets {
	public String type_of_sweet;
	public String name;
	public double cost;
	public double weight;
	public double flour_content;
	public int count;
	
	abstract public String getName();
	abstract public double getCost();
	abstract public double getWeight();
	abstract public double getFlourContent();
	abstract public int getCount();
	abstract public String getTypeOfSweet();

}
