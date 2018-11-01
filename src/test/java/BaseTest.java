import org.testng.annotations.BeforeClass;

public class BaseTest {

	Functions funcs;

	// Since this is used for multiple classes, it should be instantiated for each class. BeforeClass() works better for that than BeforeTest()
	@BeforeClass(alwaysRun = true)
	void beforeTest() {
		System.out.println("Initializing Test");
		funcs = new Functions();
	}
}
