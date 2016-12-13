

package cn.springmvc.controller;

 

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.springmvc.model.PerUser;
import cn.springmvc.service.PerUserService;

 

@Controller
@RequestMapping("/perUser")
public class PerUserController {
	
	Logger logger=LoggerFactory.getLogger(PerUserController.class);
	
	@Autowired
	private PerUserService perUserService;

	/* @RequestMapping("/login")  
	    public ModelAndView userLogin(@ModelAttribute PerUser user) {  
	        //@ModelAttribute 注解代表用模型来接收值，User对象里面的属性要和jsp页面的属性对应  
	        System.out.println(user.getUserName());  
	        System.out.println(user.getPassWord());  
	        //初始化属性对应页面  
	        ModelAndView mv =new ModelAndView("hello");  
	        mv.addObject(user);  
	        return mv;  
	    }  
	 
	    @RequestMapping("/index")  
	    public String index(){  
	        return "index";  
	    } */
	    
	    @RequestMapping(value="/login",method={RequestMethod.POST})
	    public ModelAndView loginPerUser(@ModelAttribute("perUser") PerUser perUser){
	    	logger.debug("*****"+perUser);
	    	if(1!=perUserService.insertSelective(perUser)){
	    		logger.info("**********失败了");
	    		return new ModelAndView();
	    	}
	    	
	    	logger.info("**********成功了");
	    	return new ModelAndView();
	    }

}
