package accessmodifier2;

import accessmodifier1.AccessSpecifier;

public class AccessModifier3{
	public static void main(String args[]) {
	AccessSpecifier obj1=new AccessSpecifier();
	obj1.method1(); //outside the package only public is accessible 
	//private default and protected are only accessible within the package.
	}
}