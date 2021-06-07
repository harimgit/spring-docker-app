package ms.eqr.springgradle;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyAppController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Gradle Spring Boot Docker App!";
	}

	@RequestMapping("/testSpring")
	public String testSpring() {
		return "Hi Hari. This is Spring Cloud App";
	}

	@RequestMapping("/testUser/{user}")
	public String getUser(@PathVariable String user) {
		return "Hello "+user+". This is Spring Cloud App";
	}

}
