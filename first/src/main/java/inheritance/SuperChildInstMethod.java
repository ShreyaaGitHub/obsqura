package inheritance;

public class SuperChildInstMethod extends SuperParentIntMethod{
    public void display2() {
    	String colour="black";
    	System.out.println(colour);
    	super.display(); //super is used to refer to inst method in parent class
    }
	public static void main(String[] args) {
		SuperChildInstMethod obj=new SuperChildInstMethod();
		obj.display2();
	}

}
