package PolymorphismEx;

public class OffSeason extends OnSeason{
	
	public void discount(){
		System.out.println("OffSeason DiscountPercent=" + super.offSeasonDiscount);
		super.discount();	
	}

	public static void main(String[] args) {
		OffSeason obj = new OffSeason();
		obj.discount();

	}

}
