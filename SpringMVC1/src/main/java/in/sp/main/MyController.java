package in.sp.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.*;

@Controller
public class MyController {
	

    public MyController() {
        System.out.println("MyController CREATED");
    }
		
	@GetMapping("/worldPage")
	public ModelAndView openWorldPAge() {
		System.out.println("OpenWorld method executed");
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName("world");
		
		return mav;
		
	}
	
}
