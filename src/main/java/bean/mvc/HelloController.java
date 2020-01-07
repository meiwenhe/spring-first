package bean.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

@Controller
//@RestController
@RequestMapping("/hello")
public class HelloController{ 
   @RequestMapping(method = RequestMethod.GET)
   //@GetMapping
   public String printHello(ModelMap model) {
      WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();
      model.addAttribute("message", "Hello Spring MVC Framework!   ---aann");
      return "hello";
   }
}