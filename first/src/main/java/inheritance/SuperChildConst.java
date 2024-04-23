package inheritance;

public class SuperChildConst extends SuperParentConst{
    public SuperChildConst() {
    	super("Monkey");
    	System.out.println("panda");
    }
	public static void main(String[] args) {
		SuperChildConst obj=new SuperChildConst();
	}

}
