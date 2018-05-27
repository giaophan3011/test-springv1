package webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//We tell Spring that this is the controller that handle all of the requests.
public class LoginController {
	@RequestMapping(value="/login", method = RequestMethod.GET)
	//Map the url: localhost:8080/spring-mvc/login
	//@ResponseBody
	public String sayHi(){
		return "WelcomePage";
	}

}
