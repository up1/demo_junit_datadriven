package demo.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MemberStatusTest {

	@Test
	public void memberShouldUpdateStatusBasedOnPoint() {
		LoyaltyMember loyaltyMember = LoyaltyMember.withMemberNumber("1234")
				.named("Somkiat", "Puisungnoen")
				.withCurrentPoint(0)
				.withStatus("Regular");

		loyaltyMember.earnPoint(50);
		assertEquals("Bronze", loyaltyMember.getStatus());
	}

}
