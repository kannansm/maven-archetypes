package ${groupId};

/**
 * 
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a Sample class.
 *
 * @author
 * @since 1.0
 */
public class App {
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public String sayHello(String name) {
		String helloString = "Hello " + name;
		logger.debug("Returning '{}'", helloString);
		return helloString;
	}
}