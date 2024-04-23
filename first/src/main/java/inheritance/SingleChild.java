package inheritance;

public class SingleChild extends ParentClass{
    public void display2() {
    	System.out.println("This is child method");
    }
	public static void main(String[] args) {
		SingleChild obj=new SingleChild();
		obj.display2();
		obj.display();
	}

}
