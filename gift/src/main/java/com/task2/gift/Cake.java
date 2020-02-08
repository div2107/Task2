package com.task2.gift;

public class Cake extends Sweets {
	public String cake_name;
	public int count;
	public Cake(String cake_name,String type_of_sweet,double cost,double weight,double flour_content,int count)
	{
		this.name=cake_name;
		this.type_of_sweet=type_of_sweet;
		this.cost=cost;
		this.weight=weight;
		this.flour_content=flour_content;
		this.count=count;
	}
	public void display()
	{
		System.out.println("Type_Of_Sweet"+type_of_sweet+"Name"+cake_name+"Cost"+cost+"Weight:"+weight+"Flour_Content"+flour_content);
	}
	public String getName()
	{
		return name;
	}
	public double getWeight()
	{
		return weight;
	}
	public double getFlourContent()
	{
		return flour_content;
	}
	public int getCount()
	{
		return count;
	}
	public double getCost()
	{
		return cost;
	}
	public String getTypeOfSweet()
	{
		return type_of_sweet;
	}

}
