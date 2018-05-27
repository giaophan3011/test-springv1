package webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//We tell Spring that this is the controller that handle all of the requests.
public class LoginController {
	@RequestMapping(value="/login")
	//Map the url: localhost:8080/spring-mvc/login
	//@ResponseBody
	public String sayHi(){
		return "signin";
	}

}
