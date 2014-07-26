package demo.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MemberStatusTest {
	
	@Parameters(name = "{index}: {0} initially had {1} points, earns {2} points, should become {3} ")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Regular,   0,   100,  Regular},
                {Regular,   0,    50,  Bronze},
                {Regular,   0,   200,  Silver},
                {Regular, 100,   100,  Silver},
                {Regular,   0,   500,  Gold},
                {Regular,   0,  1000,  Platinum},
        });
    }

	
	private String currentStatus;
	private int currentPoint;
	private int earnPoint;
	private String expectedStatus;
	
	public MemberStatusTest(String currentStatus, int currentPoint, int earnPoint, String expectedStatus) {
		this.currentStatus = currentStatus;
		this.currentPoint = currentPoint;
		this.earnPoint = earnPoint;
		this.expectedStatus = expectedStatus;
	}
	

	@Test
	public void memberShouldUpdateStatusBasedOnPoint() {
		LoyaltyMember loyaltyMember = LoyaltyMember.withMemberNumber("1234")
				.named("Somkiat", "Puisungnoen")
				.withCurrentPoint(this.currentPoint)
				.withCurrentStatus(this.currentStatus);

		loyaltyMember.earnPoint(this.earnPoint);
		assertEquals(this.expectedStatus, loyaltyMember.getStatus());
	}
	
	private static final Object Regular = "Regular";
	private static final Object Bronze = "Bronze";
	private static final Object Silver = "Silver";
	private static final Object Gold = "Gold";
	private static final Object Platinum = "Platinum";


}
