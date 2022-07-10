package com.greatlearning.paymoney;

import java.util.*;

public class Driver {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  the number of days transaction");
		int size = sc.nextInt();
		int transactions[] = new int[size];
		System.out.println("Enter the amount in crores for various days");
		for(int i=0;i<size;i++)
		{
			transactions[i] = sc.nextInt();
			
		}
		
	System.out.println("Enter the target amount in crores which you want to achieve");
	int targetAmt = sc.nextInt();
	System.out.println();
	displayTransactions(transactions);
	System.out.println();
	PayMoney pm = new PayMoney(); 
	int nDays = pm.numberOfDays(transactions, targetAmt);
	if(nDays != -1)
	{
		System.out.println("The target"+ targetAmt + "Crores achieved in "+ nDays);
	}
		else
			System.out.println(targetAmt+"is not achieved");
	}
	public static void displayTransactions(int []transactions)
	{
		for(int i=0;i<transactions.length;i++)
		{
			System.out.print(transactions[i] +" ");
		}
	}

}
