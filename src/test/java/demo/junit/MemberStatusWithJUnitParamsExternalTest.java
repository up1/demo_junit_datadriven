package demo.junit;

import static org.junit.Assert.assertEquals;
import static junitparams.JUnitParamsRunner.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MemberStatusWithJUnitParamsExternalTest {

	@Test
	@Parameters( method="sampleData")
	public void memberShouldUpdateStatusBasedOnPoint(String currentStatus, int currentPoint, int earnPoint, String expectedStatus) {
		LoyaltyMember loyaltyMember = LoyaltyMember.withMemberNumber("1234")
				.named("Somkiat", "Puisungnoen")
				.withCurrentPoint(currentPoint)
				.withCurrentStatus(currentStatus);

		loyaltyMember.earnPoint(earnPoint);
		assertEquals(expectedStatus, loyaltyMember.getStatus());
	}
	
	private Object[] sampleData() {
		return $(
			$(Regular,   0,   100,  Regular),
			$(Regular,   0,    50,  Bronze),
			$(Regular,   0,   200,  Silver),
			$(Regular, 100,   100,  Silver),
		    $(Regular,   0,   500,  Gold),
		    $(Regular,   0,  1000,  Platinum)
		);
	}
	
	private static final Object Regular = "Regular";
	private static final Object Bronze = "Bronze";
	private static final Object Silver = "Silver";
	private static final Object Gold = "Gold";
	private static final Object Platinum = "Platinum";
	
}
