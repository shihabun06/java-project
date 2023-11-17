package BasicCode;
import Interface.*;
import FileCode.*;
public class University implements Operation{
	
	
	
	
	FileReadWriteDemo file=new FileReadWriteDemo();
	
	public University()
	{
	}
	
	public void addPerson(Person p) 
	{
		try{
		
			file.writeInFile(p);
			
			System.out.println("Added Successfully.");
			
		}
		catch(Exception e)
		{
			System.out.println("Added not Successfully.");
		}			
		
		
	}
	
	public void ShowAllInformation()
	{
		try{
		file.readFromFile();
		}
		
		
		catch(Exception e)
		{
			System.out.println(e);
		}	
			
		
	}
	
	
	public void removePerson(String id)
	{
		try{
		file.deleteLine(id);
		}
		
		catch(Exception e)
		{
			System.out.println("Delete Not Successful");
		}	
		
	}
	
	
	public void search(String id)
	{
		try{
		
		file.search(id);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
	}
	
	
	
}
