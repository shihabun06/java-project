package FileCode;
import java.lang.*;
import java.io.*;
import BasicCode.*;


public class FileReadWriteDemo
{
	private File file;				
	private FileWriter writer;		
	private FileReader reader;		
	private BufferedReader bfr;	
	String[] words=null;
	String s;	
	
	
	public void writeInFile(Person p)
	{
		
		try
		{
			file = new File("History.txt");	
			
			file.createNewFile();					
			writer = new FileWriter(file, true);	
			writer.write(p.ShowInformation()+"\r"+"\n"+"**"+"\r"+"\n");	
				
			writer.flush();							
			writer.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		
		
		try
		{
			file = new File("History.txt");	
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String text="";
			String temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.print(text);   				
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}






	public void search(String id)
	{
		try
		{
			file = new File("History.txt");	
			reader = new FileReader(file);			
			bfr = new BufferedReader(reader);		
			String text="", temp;	
			boolean find=false;
				boolean breaak=false;				
			
			while((temp=bfr.readLine())!=null)		
			{
				
				
				if(breaak)
				break;   
				
				words=temp.split(" ");
			
				for(String word : words )
				{
					if(word.equals(id))
					 find=true;
					if(word.equals("**"))
					find=false;
				}
				if(find)
				{
					System.out.println(temp);
				}
				
						
			}
			
						
			reader.close();							
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}



		public  void deleteLine(String id)
    {
			
			boolean find=false;
			boolean stop=false;
        try
        { 
                BufferedReader file = new BufferedReader(new FileReader("History.txt"));
                String line;
                String input = "";
                while ((line = file.readLine()) != null) 
                {
									
                    words=line.split(" ");
				for(String word : words )
				{
					if(word.equals(id))
					{
						find=true;
						System.out.println("deleted Successfully");
					}
					 
					if(word.equals("**")&&find)
					{
           
						stop=true;
						
					}
				
				}
				
			
				
										if(find&&!stop)
										{
										
											continue;
                        
										}
										
										
                    input += line + '\n';
                }
                FileOutputStream File = new FileOutputStream("History.txt");
                File.write(input.getBytes());
                file.close();
                File.close();
        }
        catch (Exception e)
        {
                System.out.println("Problem reading file.");
        }
    }
	}



	
	
	







