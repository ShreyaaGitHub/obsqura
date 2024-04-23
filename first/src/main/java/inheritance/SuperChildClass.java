package inheritance;
//priority is given more to child class
public class SuperChildClass extends SuperParentClass{
    String name="Shreya";
    public void display() {
    	System.out.println(name);
    	System.out.println(super.name); //super used to refer to parent inst var
    }
	public static void main(String[] args) {
		SuperChildClass obj=new SuperChildClass();
		obj.display();
	}

}
