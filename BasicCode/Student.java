package BasicCode;
import FileCode.*;
public class Student extends Person
{
	
	private double cgpa;
	private String admissionDate;
	
	public Student()
	{
	}
	
	public Student(String name,String id,int age,String phoneNo,String email,String occupation,String admissionDate,double cgpa)
	{
		super( name,id,age,phoneNo, email,occupation); 
		this.admissionDate=admissionDate;
		this.cgpa=cgpa;
	}
	
	
	public void setAdmissionDate(String admissionDate)
		{
			this.admissionDate=admissionDate;
		}
		
	public String getAdmissionDate()
		{
			return this.admissionDate;
		}
		
		
		public void setCgpa(double cgpa)
		{
			this.cgpa=cgpa;
		}
		
	public double getCgpa()
		{
			return this.cgpa;
		}
		
		
		public String ShowInformation(){
			
			super.ShowInformation();
			super.allInfo+=getCgpa()+"\n";
			super.allInfo+=getAdmissionDate()+"\n";
			
		
			return super.allInfo;
		}
	
	
	
		
		

}
	
	


