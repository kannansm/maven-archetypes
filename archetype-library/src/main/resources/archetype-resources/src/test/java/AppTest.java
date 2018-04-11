package ${groupId};

/**
 * 
 */
import org.testng.annotations.Test;

/**
 * @author
 *
 */
public class AppTest {
	App app = new App();

	@Test
	public void testSayHello() {
		app.sayHello("World");
	}
}