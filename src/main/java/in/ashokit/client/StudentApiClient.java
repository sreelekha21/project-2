package in.ashokit.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "STUDENT-API")
public interface StudentApiClient {
	
	@GetMapping("/student")
	public String invokeStudentMsg();

}
