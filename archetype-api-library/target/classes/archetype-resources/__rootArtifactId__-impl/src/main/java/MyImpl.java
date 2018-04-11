package ${groupId};

/**
 * 
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This is a Sample Implementation.
 *
 * @author
 * @since 1.0
 */
public class MyImpl implements MyInterface {
	private static final Logger logger = LoggerFactory.getLogger(MyImpl.class);

	public String sayHello(String name) {
		String helloString = "Hello " + name + " !!!";
		logger.debug("Returning '{}'", helloString);
		return helloString;
	}

	/**
	 * <code>
	 * Command to run the <b>MyImpl</b> main class:<br>
	 * With <i>App.properties</i> and <i>log4j.xml</i> in the <b>target/test-classes</b> directory:<br>
	 * java -classpath target/${artifactId}-1.0-SNAPSHOT.jar:target/dependency-jars/*:target/test-classes ${groupId}.MyImpl
	 * <br>
	 * <br> With <b>log4j.configuration</b> option:<br>
	 * java -classpath target/${artifactId}-1.0-SNAPSHOT.jar:target/dependency-jars/* -Dlog4j.configuration=file:target/test-classes/log4j.xml ${groupId}.MyImpl<br>
	 * </code>
	 * @param args Command Line Arguments
	 */
	public static void main(String[] args) {
		logger.info("************ Number of Command Line Arguments: '{}' args", args.length);
		long t1 = System.currentTimeMillis();

		String TEST_STRING = "WORLD";

		try {
			logger.info("\n************ Initializing MyImpl ...\n");
			MyImpl myImpl = new MyImpl();
			logger.info("\n************ MyImpl Initialization SUCCESSFUL ...\n");

			myImpl.sayHello(TEST_STRING);
			logger.info("\n************ MyImpl sayHello Invocation SUCCESSFUL ...\n");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			System.exit(1);
		}

		long t2 = System.currentTimeMillis();
		logger.info("\n************ MyImpl Test Invocation SUCCESSFUL ...");
		logger.info("\n************ Time taken: '{}' ms", (t2 - t1));
		System.exit(0);
	}
}