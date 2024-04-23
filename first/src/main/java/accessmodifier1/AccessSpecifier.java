package accessmodifier1;
public class AccessSpecifier{
    public void method1() {
    	System.out.println("This is public");
    }
    private void method2() {
    	System.out.println("This is private");
    }
    protected void method3() {
    	System.out.println("This is protected");
    }
    void method4() {
    	System.out.println("This is default");
    }
	public static void main(String[] args) {
		AccessSpecifier obj=new AccessSpecifier();
		//object should be created for the method 
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}

}
