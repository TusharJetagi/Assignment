package Inheritance;

class Employee 
{
	long employeeId;
	String employeeName;
	String employee_Address;
	Long employee_phone;
	double basicSalary;
	double specialAllowance=250.80;
	double Hra=1000.50;
	double transportAllowance;
	
	Employee(long id, String Name,String address,long phone)   //Constructor
	{
		this.employeeId = id;
		this.employeeName = Name;
		this.employee_Address = address;
		this.employee_phone = phone;
	}
	
	double calculateTransportAllowance()       
	{
		
		transportAllowance = 10.0/100.0*basicSalary;
		return transportAllowance;
		
	}
	
	double calculateSalary()    //Method for Calculation
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100); 
		return salary;
	}

}
class Manager extends Employee      
{
	Manager(long id, String Name,String address,long phone,double salary)
	{
		super(id,Name,address,phone);
		this.basicSalary=salary;
		
	}

	double calculateTransportAllowance() 
	{
		double transportAllowance = 15*basicSalary /100;
		return transportAllowance;
		
	}
}
class Trainee extends Employee
{
	Trainee(long id, String Name,String address,long phone,double salary)
	{
		super(id,Name,address,phone);
		this.basicSalary=salary;
	}
		
}
public class InheritanceActivity
{         
	public static void main(String[] args) //Main Method
	{
		Manager m = new Manager(126534,"Peter","Chennai India",237844,65000);
		System.out.println("Manager Salary is: "+m.calculateSalary());
		System.out.println("Manager Transport Allowance: "+m.calculateTransportAllowance());
		System.out.println("Updated Salary of Manager: "+((m.calculateSalary()+m.calculateTransportAllowance())));
		
		//Trainee
		Trainee t = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println("\nTrainee Salary is: "+t.calculateSalary());
		System.out.println("Trainee Transport Allowance: "+t.calculateTransportAllowance());
		System.out.println("Updated Salary of Trainee: "+((t.calculateSalary()+t.calculateTransportAllowance())));
		
	}
}
