package BasicCode;
import FileCode.*;
public class Employee extends Person{

	
	private double salary;

	public Employee()
	{
	}
	
	public Employee(String name,String id,int age,String phoneNo,String email,String occupation,double salary)
	{
		super(name,id, age,phoneNo, email, occupation); 
		
		this.salary=salary;
		
	}
	
		
		
	public void setSalary(double salary)
		{
			this.salary=salary;
		}
		
	public double getSalary()
		{
			return this.salary=salary;
		}
		
		
		
		
		public String ShowInformation(){
			
			super.ShowInformation();
			
			super.allInfo+=this.getSalary()+"\n";
			return super.allInfo;
		}
	
	

}

