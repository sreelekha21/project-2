package in.ashokit.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.StudentApiClient;
import in.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String welcomeMsg = welcomeClient.invokeWelcomeMsg();
		
		String greetMsg = "Good Morning, ";
		
		return greetMsg.concat(welcomeMsg);
	}
	
	@Autowired
	private StudentApiClient studentApiClient;
	
	@GetMapping("/greet")
	public String getGreetMsg1() {
		
		String studentMsg = studentApiClient.invokestudentMsg();
		
		String greetMsg = "Good Morning, ";
		
		return greetMsg.concat(studentMsg);
	}
	

}
