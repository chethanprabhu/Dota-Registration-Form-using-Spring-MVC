package spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/mainPage")
	public String home() {
		System.out.println("reached here");
		return "form";
	}
}
