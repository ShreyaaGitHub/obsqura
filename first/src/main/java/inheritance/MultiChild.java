package inheritance;

public class MultiChild extends MultiParent2{
    public void multichild() {
    	System.out.println("This is multi level Child class");
    }
	public static void main(String[] args) {
		MultiChild obj=new MultiChild();
		obj.multidisplay();
		obj.multidisplay2();
		obj.multichild();

	}

}
