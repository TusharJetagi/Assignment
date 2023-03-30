package com.cognizant.tax;

public class TaxCalculator 
{
	float basicSalary=125000;
	Boolean citizenship=true;
	float tax;
	int nettSalary;
	
	void calculateTax() 
	{
		
		tax = 30*basicSalary/100f;
		System.out.println("The Tax of the employee for the " +basicSalary +" is " +tax);
	}  
	
	void deductTax() 
	{
		nettSalary =(int)(basicSalary-tax);
		System.out.println("The nett salary of the employee is : " +nettSalary);
		
	}
	void validateSalary() 
	{
		if(basicSalary>100000  && citizenship==true)
		{
			System.out.println("The salary and citizenship eligibility: true");
			
		}
		else {
			
			System.out.println("The salary and citizenship eligibility: false");
		}
		
	}
	public class EmployeeTax
	{
		public static void main(String[] args) 
		{
			TaxCalculator t=new TaxCalculator();
			t.calculateTax();
			t.deductTax();
			t.validateSalary();
		}
	}

}
