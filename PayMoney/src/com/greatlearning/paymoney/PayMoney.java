package com.greatlearning.paymoney;

public class PayMoney 
{
	public int numberOfDays(int transactions[], int targetAmt)
	{
		for(int i=0; i<=transactions.length-1;i++)
		{
			if(targetAmt==transactions[i] || targetAmt < transactions[i])
			{
				return i+1;
			}
			else
				targetAmt = targetAmt - transactions[i];
		}
		return targetAmt;
	}
}