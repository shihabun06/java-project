import BasicCode.*;

import FileCode.*;

import java.util.Scanner;
public class Start{
	
	
	public static void main(String[] args)
	{
		FileReadWriteDemo file=new FileReadWriteDemo();
		
		String name, id,admissionDate,phoneNo, email,occupation;
	  int age,choice,personType,workingHour;
		double salary,cgpa;
		
		
		University AIUB=new University();
		Scanner input=new Scanner(System.in);
		
		
		while(true)
		{
			
		
		System.out.println("What do you want to do?");
		System.out.println("Press 1 for add new person");
		System.out.println("Press 2 for delete person");
		System.out.println("Press 3 for search person");
		System.out.println("Press 4 for show all information");
		System.out.println("Press 5 for Exit");
		
		
		choice=input.nextInt();
		
		
		switch(choice)
		{
			
			case 1:
			System.out.println("Which type of person do you want to add?");
			System.out.println("Press 1 for Employee:");
			System.out.println("Press 2 for Faculty: ");
			System.out.println("Press 3 for Student: ");
			personType=input.nextInt();
			
			
			if(personType==1)
				
			{
				try{
				System.out.println("Enter Name of Employee: ");
				input.nextLine();
				name=input.nextLine();

				System.out.println("Enter id of Employee: ");
				
				id=input.nextLine();
				
				System.out.println("Enter age of Employee: ");
				age=input.nextInt();
				
				System.out.println("Enter PhoneNo of Employee:");
				input.nextLine();
				phoneNo=input.nextLine();
				
				System.out.println("Enter Email of Employee: ");
				email=input.nextLine();
			
				
				System.out.println("Enter Occupation of Employee: ");
				occupation=input.nextLine();
				
				
				System.out.println("Enter Salary of Employee: ");
				salary=input.nextDouble();
				
				AIUB.addPerson(new Employee(name,id,age,phoneNo,email,occupation,salary));
				
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			}
			}
			
			
			
			else if(personType==2)
				
			{
				try{
				System.out.println("Enter Name of Faculty: ");
				input.nextLine();
				name=input.nextLine();

				System.out.println("Enter id of Faculty: ");
				id=input.nextLine();
				
				
				System.out.println("Enter age of Faculty: ");
				age=input.nextInt();
				
				System.out.println("Enter PhoneNo of Faculty:");
				input.nextLine();
				phoneNo=input.nextLine();
				
				
				System.out.println("Enter Email of Faculty: ");
			
				email=input.nextLine();
				
				
				System.out.println("Enter Occupation of Faculty: ");
				
				occupation=input.nextLine();
				
				
				System.out.println("Enter Salary of Faculty: ");
				salary=input.nextDouble();
				
				System.out.println("Enter WorkingHour of Faculty: ");
				workingHour=input.nextInt();
				
				AIUB.addPerson(new Faculty(name,id,age,phoneNo,email,occupation,salary,workingHour));
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			}

				
			}
				
				
				else if(personType==3)
					
				
			{
				try{
				System.out.println("Enter Name of Student: ");
				input.nextLine();
				name=input.nextLine();

				System.out.println("Enter id of Student: ");
				id=input.nextLine();
				
				System.out.println("Enter age of Student: ");
				age=input.nextInt();
				
				System.out.println("Enter PhoneNo of Student:");
				input.nextLine();
				phoneNo=input.nextLine();
				
				System.out.println("Enter Email of Student: ");
				email=input.nextLine();
				
				
				System.out.println("Enter Occupation of Student: ");
				occupation=input.nextLine();
				
				
				System.out.println("Enter AdmissionDate of Student: ");
				
				admissionDate=input.nextLine();
				
				
				System.out.println("Enter CGPA of Student: ");
				cgpa=input.nextDouble();
				
				
				
				AIUB.addPerson(new Student(name,id,age,phoneNo,email,occupation,admissionDate,cgpa));
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			}
			
			}
							
			break;
			
			
			case 4:
			AIUB.ShowAllInformation();
			
			break;
			
			
			
			
			
			case 2:
			
			
			
				try{
				System.out.println("Enter id : ");
				input.nextLine();
				id=input.nextLine();
				AIUB.removePerson(id);
				}
				
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			
			}
			
			break;
			
			
			
			
			
			case 3:
			
			
			
			   try{
				System.out.println("Enter id of Employee: ");
				input.nextLine();
				id=input.nextLine();
			
				
				AIUB.search(id);
			
				}
			catch(Exception E)
			{
				input.nextLine();
				System.out.println("SOmething wrong !!!");
			}
			
			
			
		
			
			break;
			case 5:
			System.exit(0);
			break;
			
			}
		
			
		}
	}

	

	
	
		
	
}