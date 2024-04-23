package inheritance;

public class HeirarchicalChild1 extends HeirarchicalParentClass{
	public void heir3() {
    	System.out.println("This is Child A");
    }
	public static void main(String[] args) {
		HeirarchicalChild1 obj=new HeirarchicalChild1();
		obj.heir1();
		obj.heir3();


	}
}
