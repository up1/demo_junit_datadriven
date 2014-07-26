package demo.junit;

import static junitparams.JUnitParamsRunner.$;

public class MemberDataTest {
	public static Object[] provideSampleData() {
		return $(
			$(Regular,   0,   100,  Regular),
			$(Regular,   0,    50,  Bronze),
			$(Regular,   0,   200,  Silver),
			$(Regular, 100,   100,  Silver),
		    $(Regular,   0,   500,  Gold),
		    $(Regular,   0,  1000,  Platinum)
		);
	}
	
	public static final Object Regular = "Regular";
	public static final Object Bronze = "Bronze";
	public static final Object Silver = "Silver";
	public static final Object Gold = "Gold";
	public static final Object Platinum = "Platinum";
	
}
