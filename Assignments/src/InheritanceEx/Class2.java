package InheritanceEx;

public class Class2 extends Class1 {
	double hra;
	double pf;
	
	public Class2() {
		super(80000, 15000, 1000000);
	}	
	
	/*public void Class2(double hra, double pf) {
		double this.hra=hra;
		double this.pf=pf;
	}*/

	public double getHRA(double basic){
		double hra = 0.05 * basic;
		return hra;		
	}
	
	public double getPF(double basic) {
		double pf=0.10 * basic;
		return pf;
	}
	
}
