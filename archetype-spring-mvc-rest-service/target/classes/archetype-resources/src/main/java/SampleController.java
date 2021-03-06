package ${groupId};

/**
 * 
 */
import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a Sample Spring MVC 4.x Controller.
 *
 * @author
 * @since 1.0
 */
@RestController
@RequestMapping("/hello")
public class SampleController {
	private static final Logger logger = LogManager.getLogger(SampleController.class);

	@ResponseBody
	@GetMapping(value = "/{name}", produces = { "application/json;charset=UTF-8" })
	public Map<String, Object> helloworld(Model model, @PathVariable("name") final String name) {		
		String helloString = "Hello " + name + "!!!";
		Map<String, Object> response = new HashMap<String, Object>();
		response.put("input", name);
		response.put("output", helloString);
		
		logger.debug("Returning '{}'", response);
		return response;
	}
}