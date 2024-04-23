package inheritance;

public class HeirarchicalChild2 extends HeirarchicalParentClass{
    public void heir2() {
    	System.out.println("This is Child B");
    }
	public static void main(String[] args){
		HeirarchicalChild2 obj=new HeirarchicalChild2();
		obj.heir1();
		obj.heir2();


	}

}
