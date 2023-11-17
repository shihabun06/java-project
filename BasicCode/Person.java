package BasicCode;
import FileCode.*;

public class Person{

	

	
	private String name;
	private int age;
	private String id;
	private String phoneNo;
	private String email;
	private String occupation;
	protected  String allInfo="";
	FileReadWriteDemo file=new FileReadWriteDemo();
	
	public Person()
	{
	}
	
	public Person(String name,String id,int age,String phoneNo,String email,String occupation)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.phoneNo=phoneNo;
		this.email=email;
		this.occupation=occupation;
		
	}
	
	public void setName(String name)
		{
			this.name=name;
		}
		
	public String getName()
		{
			return this.name;
		}
		
		
		public void setAge(int age)
		{
			this.age=age;
		}
		
	public int getAge()
		{
			return this.age;
		}
		
		
	public void setId(String id)
		{
			this.id=id;
		}
		
	public String getId()
		{
			return this.id;
		}
		
		
		public void setPhoneNo(String phoneNo)
		{
			this.phoneNo=phoneNo;
		}
		
	public String getPhoneNo()
		{
			return this.phoneNo;
		}
		
		
		public void setEmail(String email)
		{
			this.email=email;
		}
		
	public String getEmail()
		{
			return this.email;
		}
		
		public void setOccupation(String occupation)
		{
			this.occupation=occupation;
		}
		
	public String getOccupation()
		{
			return this.occupation;
		}
		
		
		public String ShowInformation(){
			allInfo+=getId()+"\n";
			
			allInfo+=getName()+"\n";
			
			allInfo+=getAge()+"\n";
			allInfo+=getPhoneNo()+"\n";
			allInfo+=getEmail()+"\n";
			allInfo+=getOccupation()+"\n";

			return allInfo;
			

			
		}
		
		
		 
}