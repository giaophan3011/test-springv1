package webapp.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping(value="/firstpage")
	@ResponseBody
	public String frontEnd (){
		return "Welcome";
	}

}
