package InheritanceEx;

public class Class3 extends Class2{
 Class1 b;
 Class2 c;
	public static void main(String[] args) {
		Class1 obj=new Class1(80000.00,10000,2000000.00);
		Class2 obj2=new Class2();
		Class3 obj3= new Class3();
		
		double salary = obj3.calculateSalary(obj,obj2);

		System.out.println(salary);
	}
	public double calculateSalary(Class1 b, Class2 c) {
		this.b=b;
		this.c=c;
		double total = b.basicPay+c.getHRA(b.basicPay)-c.getPF(basicPay)-b.deduction+b.bonus;
		return total;
	}

}
