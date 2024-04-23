package accessmodifier1;

public class AccessModifier2 {
	
		
		public static void main(String args[]) {
			AccessSpecifier obj=new AccessSpecifier();
			obj.method1();
		//	obj.method2(); private doesnt have access outside the class thus error
			obj.method3();
			obj.method4();
		}
}
