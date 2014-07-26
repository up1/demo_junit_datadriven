package demo.junit;

public class LoyaltyMember {
	private static LoyaltyMember loyaltyMember = new LoyaltyMember();
	
	private LoyaltyMember() {
		
	}

	public static LoyaltyMember withMemberNumber(String memberNumber) {
		return loyaltyMember;
	}

	public LoyaltyMember named(String firstName, String lastName) {
		return loyaltyMember;
	}

	public LoyaltyMember withCurrentPoint(int i) {
		return loyaltyMember;
	}

	public LoyaltyMember withStatus(String string) {
		return loyaltyMember;
	}

	public void earnPoint(int point) {
		
	}

	public String getStatus() {
		return "Bronze";
	}

}
