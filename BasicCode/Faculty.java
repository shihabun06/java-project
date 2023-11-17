package BasicCode;
import FileCode.*;
public class Faculty extends Person{

	
	private double salary;
	private int workingHour;

	public Faculty()
	{
	}
	
	public Faculty(String name,String id,int age,String phoneNo,String email,String occupation,double salary,int workingHour)
	{
		super(name, id,age, phoneNo, email, occupation); 
		
		this.salary=salary;
		
		this.workingHour=workingHour;
		
	}
	
		
		
	public void setSalary(double salary)
		{
			this.salary=salary;
		}
		
	public double getSalary()
		{
			return this.salary=salary;
		}
		
		
		public void setWorkingHour(int workingHour)
		{
			this.workingHour=workingHour;;
		}
		
	public int getWorkingHour()
		{
			return this.workingHour=workingHour;
		}
		
		
		
		
		public String ShowInformation(){
			
			super.ShowInformation();
			
			super.allInfo+=this.getSalary()+"\n";
			super.allInfo+=this.getWorkingHour()+"\n";
			return super.allInfo;
		
		}
	
	

}
