package com.task2.gift;
import java.util.*;
public class Main {
	public static void main(String[] args)
	{
		Scanner sca=new Scanner(System.in);
		Chocolates c1=new Chocolates("Fivestar","Chocolate",20,10.5,33.6,4);
		Chocolates c2=new Chocolates("MilkyBar","Chocolate",40,8.7,20.2,3);
		Candies ca1=new Candies("Lollipop","Candy",25,5.9,7.8,2);
		Candies ca2=new Candies("OrangeCandy","Candy",22,11.8,5.6,3);
		Cake cake1=new Cake("StrawberryCake","Cake",25,7.7,13.4,2);
		Cake cake2=new Cake("BlackForestCake","Cake",18,12.8,30.8,3);
		Sweets sw[]=new Sweets[6];
		sw[0]=c1;
		sw[1]=c2;
		sw[2]=ca1;
		sw[3]=ca2;
		sw[4]=cake1;
		sw[5]=cake2;
		Gifts g=new Gifts(sw);
		g.sortByFlourContent();
		g.display();
		System.out.println("Enter the range for sweets to be displayed:");
		float r1=sca.nextFloat();
		float r2=sca.nextFloat();
		for(int i=0;i<sw.length;i++)
		{
			if((sw[i].type_of_sweet.equals("Chocolate") || sw[i].type_of_sweet.equals("Candy") || sw[i].type_of_sweet.equals("Cake")) && (sw[i].flour_content>=r1) &&(sw[i].flour_content<=r2))
			{
				System.out.println(sw[i].getName());
			}
			
		}
	}

}
