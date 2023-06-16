
public class PICDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PIC me = new PIC();
		PIC myFriend1 = new PIC();
		PIC myFriend2 = new PIC();
		
		
		me.setName("Aiden");
		me.setAge(10);
		me.setAddress("123 De Anza");
		me.setPhone("(123)-456-7890");		
		
		myFriend1.setName("EEE");
		myFriend1.setAge(12);
		myFriend1.setAddress("123 Anza De");
		myFriend1.setPhone("(123)-789-4560");
		
		myFriend2.setName("FFF");
		myFriend2.setAge(16);
		myFriend2.setAddress("555 Anza De");
		myFriend2.setPhone("(555)-555-5555");
		
		System.out.print("My info");
		System.out.print("Name : " + me.getName());
		System.out.print("Age : " + me.getAge());
		System.out.print("Address : " + me.getAddress());
		System.out.print("Phone : "+ me.getPhone());
		
		System.out.print("#1's info");
		System.out.print("Name : " + myFriend1.getName());
		System.out.print("Age : " + myFriend1.getAge());
		System.out.print("Address : " + myFriend1.getAddress());
		System.out.print("Phone : "+ myFriend1.getPhone());
		
		System.out.print("My info");
		System.out.print("Name : " + myFriend2.getName());
		System.out.print("Age : " + myFriend2.getAge());
		System.out.print("Address : " + myFriend2.getAddress());
		System.out.print("Phone : "+ myFriend2.getPhone());
		
		
	}

}
