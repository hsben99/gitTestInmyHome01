package com.ncs.green;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping
	public ModelAndView gitTest(ModelAndView mv) {
		String test = "1번째 버전";
		mv.addObject("test", test);
		mv.setViewName("test/test");
		return mv;
	}
}
