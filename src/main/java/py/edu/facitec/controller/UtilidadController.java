package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UtilidadController {

	//url a responder 
		@RequestMapping("/comollegar")
		public String index(){
		
			System.out.println("como llegar");
			
			
			return "comollegar";
		}
}
