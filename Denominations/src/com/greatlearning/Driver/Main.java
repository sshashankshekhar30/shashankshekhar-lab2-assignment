package com.greatlearning.Driver;
import com.greatlearning.service.Currency;
import com.greatlearning.service.NotesCount;
import java.util.*;
import  java.util.Collections;
import com.greatlearning.model.MergeSort;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the number of Currency Denominations");
		int numOfDenom = sc.nextInt();
		//Creating Denominations array
		int denominations[] = new int[numOfDenom];
		System.out.println("Enter Currency Denominations");
		for(i=0;i<numOfDenom;i++)
		{
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount which you want to pay");
		int amount = sc.nextInt();
		for(int i1=0;i1<denominations.length;i1++)
		{
			System.out.print(i1+" ");
		}
		System.out.println();
		Currency currency = new Currency(denominations, numOfDenom);
		MergeSort obj = new MergeSort();
		obj.MargeSort(Currency.denominations, 0,denominations.length-1);
		   
		obj.DisplayDenominetions(Currency.denominations, denominations.length-1);
		NotesCount.numberOfDenominations(Currency.denominations , amount);
		
		
		

	}

}
