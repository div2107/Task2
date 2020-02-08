package com.task2.gift;

public class Gifts {
	Sweets s[];
	double no_of_items;
	double weight;
	double cost;
	double flour_content;
	public Gifts(Sweets s[])
	{
		no_of_items=0;
		weight=0;
		cost=0;
		flour_content=0;
		this.s=new Sweets[s.length];
		for(int i=0;i<s.length;i++)
		{
			this.s[i]=s[i];
	        cost=cost+s[i].count*s[i].getCost();
	        weight=weight+s[i].getWeight();
	        no_of_items+=s[i].getCount();
	        flour_content+=s[i].getFlourContent();
		}
	}
	public void sortByFlourContent()
	{
		Sweets t;
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].getFlourContent()>s[j].getFlourContent())
				{
					t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			}
		}
	}
	public void display()
	{
		System.out.println("GiftBox sorted based on flour content");
		System.out.println("Name \t Weight \t Count \t FlourContent");
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i].getName()+"\t"+s[i].getWeight()+"\t"+s[i].getCount()+"\t"+s[i].getFlourContent());
		}
		System.out.println("Weight of whole Giftbox:"+weight);
		System.out.println("FlourContent in Giftbox"+flour_content);
	}

}
