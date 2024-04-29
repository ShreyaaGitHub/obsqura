package SuperEx;

public class Class2 extends	Class1 {
	 

	public static void main(String[] args) {		
		Class2 obj = new Class2();
		obj.checkDivisibility(2,10);
	}
	
	public void checkDivisibility(int x, int y) {
		int result=super.add(x, y);
		if (result%10 ==0)
			System.out.println("Is Divisbile by 10");
		else
			System.out.println("Not Divisbile by 10");
		}

}
