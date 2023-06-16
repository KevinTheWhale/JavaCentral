
public class PIC 
{
	
	private String name;
	private String address;
	private int age;
	private String phone;
	
	
	public PIC()
	{
		name = " ";
		address = " ";
		age = 0;
		phone = " ";
	}
	
	public PIC(String myName, String myAddress, int myAge, String myPhone)
	{
		name = myName;
		address = myAddress;
		age = myAge;
		phone = myPhone;
	}
	
	public void setName(String myName)
	{
		name = myName;
	}
	
	public void setAddress(String myAddress)
	{
		address = myAddress;
	}

	public void setAge(int myAge)
	{
		age = myAge;
	}
	
	public void setPhone(String myPhone)
	{
		phone = myPhone;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	
}
		
	
	
	
	