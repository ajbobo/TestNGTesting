import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestFunctions extends BaseTest {

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(dataProvider = "provideAddParams", groups = {"default", "one"})
	void testAdd(int one, int two, int expected) {
		Assert.assertEquals(funcs.addNums(one, two), expected);
	}

	@DataProvider
	public static Object[][] provideAddParams() {
		return new Object[][] {
				{ 1, 1, 2 },
				{ 1, 2, 3 },
				{ 3, 4, 7 },
				{ 45, 54, 99 },
		};
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(dataProvider = "provideMultParams", groups = {"one"})
	void testMult(int one, int two, int three, int expected) {
		Assert.assertEquals(funcs.multNums(one, two, three), expected);
	}

	@DataProvider
	public static Object[][] provideMultParams() {
		return new Object[][] {
				{ 1, 1, 1, 1 },
				{ 1, 2, 2, 4 },
				{ 3, 4, 5, 60 },
				{ 45, 54, 2, 4860 },
		};
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(dataProvider = "provideCombo1Params", groups = {"two"})
	void testCombo1(int one, int two, int three, int expected) {
		Assert.assertEquals(funcs.combo1(one, two, three), expected);
	}

	@DataProvider
	public static Object[][] provideCombo1Params() {
		return new Object[][] {
				{ 1, 1, 1, 2 },
				{ 1, 2, 2, 4 },
				{ 3, 4, 5, 17 },
				{ 45, 54, 2, 2432 },
		};
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Test(dataProvider = "provideCombo2Params")
	void testCombo2(int one, int two, int three, int expected) {
		Assert.assertEquals(funcs.combo2(one, two, three), expected);
	}

	@DataProvider
	public static Object[][] provideCombo2Params() {
		return new Object[][] {
				{ 1, 1, 1, 2 },
				{ 1, 2, 2, 4 },
				{ 3, 4, 5, 27 },
				{ 45, 54, 2, 2520 },
		};
	}
}
