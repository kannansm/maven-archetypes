package ${groupId};

/**
 * 
 */
import org.testng.annotations.Test;

/**
 * @author
 *
 */
public class MyImplTest {
	MyImpl impl = new MyImpl();

	@Test
	public void testSayHello() {
		impl.sayHello("World");
	}
}