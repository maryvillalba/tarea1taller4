package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	//url a responder 
	@RequestMapping("/")
	public String index(){
	
		System.out.println("Hola Mundo Spring MVC");
		
		
		return "hola mundo";
	}

}
