package demo.junit;

import static org.junit.Assert.assertEquals;
import static junitparams.JUnitParamsRunner.*;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MemberStatusWithJUnitParamsExternalClassTest {

	@Test
	@Parameters( source=MemberDataTest.class)
	public void memberShouldUpdateStatusBasedOnPoint(String currentStatus, int currentPoint, int earnPoint, String expectedStatus) {
		LoyaltyMember loyaltyMember = LoyaltyMember.withMemberNumber("1234")
				.named("Somkiat", "Puisungnoen")
				.withCurrentPoint(currentPoint)
				.withCurrentStatus(currentStatus);

		loyaltyMember.earnPoint(earnPoint);
		assertEquals(expectedStatus, loyaltyMember.getStatus());
	}
}

