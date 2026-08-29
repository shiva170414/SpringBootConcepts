package in.sp.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.main.bean.User;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.*;
import org.springframework.ui.Model;

@Controller
public class MyController {

	public MyController() {
		System.out.println("MyController CREATED");
	}

	@GetMapping("/worldPage")
	public ModelAndView openWorldPAge() {
		System.out.println("OpenWorld method executed");

		ModelAndView mav = new ModelAndView();
		mav.setViewName("world");

		return mav;

	}

	@GetMapping("myForm")
	public String openMyForm() {
		return "myForm";
	}

//	@PostMapping("/submitForm")
//	public String handleMyForm(HttpServletRequest req) {
//		String name=req.getParameter("studentName");
//		String rollno=req.getParameter("rollNumber");
//		String email=req.getParameter("email");
//		String phone=req.getParameter("phone");
//		
//		System.out.println("Name"+name +"\n"+ rollno+"\n"+email+"\n"+phone);
//		
//		return "profile";
//	}
	// The above is the older version used in servlet

//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("studentName") String name, 
//			@RequestParam("rollNumber") String rollno,
//			@RequestParam("email") String email, 
//			@RequestParam("phone") String phone, 
//			Model model) {
//		
//		System.out.println("Name " + name + "\n" + rollno + "\n" + email + "\n" + phone);
//		model.addAttribute("model_name",name);
//		model.addAttribute("model_roll",rollno);
//		model.addAttribute("model_email",email);
//		model.addAttribute("model_phone",phone);
//		return "profile";
//	}

	// If multiple users are there or somay field are there then we can simplify
	// this by below code creating a bean user class

//	@PostMapping("/submitForm")
//	public String handleMyForm(
//			@RequestParam("studentName") String name, 
//			@RequestParam("rollNumber") String rollno,
//			@RequestParam("email") String email, 
//			@RequestParam("phone") String phone, 
//			Model model) {
//		
//		User user=new User();
//		user.setName(name);
//		user.setRoll(rollno);
//		user.setEmail(email);
//		user.setPhone(phone);
//		model.addAttribute("model_user",user);
//		
//		return "profile";
//	}

	// One more better option is @ModelAttribute

	@PostMapping("/submitForm")
	public String handleMyForm(@ModelAttribute User user) {

		System.out.println(
				"Name " + user.getName() + "\n" + user.getRoll() + "\n" + user.getEmail() + "\n" + user.getPhone());

		return "profile";
	}

}
