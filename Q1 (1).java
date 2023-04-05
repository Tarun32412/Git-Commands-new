package constructor_and_static_lab;

//Q 1  WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
//passed two arguments so that this constructor gets invoked after creation of obj1 and obj2

public class Q1 {
	
	String name;
	int id;
	
	Q1 (String name , int id)
	{
		this.name = name;
		this.id = id;

	}
	
	void display ()
	{
		System.out.println(name + " " + id);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q1 object1 = new Q1 ("Pratik", 101);
		Q1 object2  = new Q1 ("Durvas", 201);
		
		object1.display();
		object2.display();

	}
}
