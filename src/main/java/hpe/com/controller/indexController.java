package hpe.com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class indexController {

	@RequestMapping("index")
	public String index(ModelMap model,HttpSession session) {
		System.out.println("index");
		//model.addAttribute("userName", "wangwei");
		session.setAttribute("userName", "wangwei");
		return "index";
	}
}
