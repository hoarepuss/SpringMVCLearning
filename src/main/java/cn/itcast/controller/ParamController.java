package cn.itcast.controller;

import cn.itcast.entity.Account;
import cn.itcast.entity.User;
import cn.itcast.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/param")
@SessionAttributes(value = {"sessionAttribute001"})
public class ParamController {

    @RequestMapping("/testParam")
    public String testParam(String username, String password){
        System.out.println("username: " + username + ", password: " + password);
        return "success";
    }

    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "uname") String username){
        System.out.println(username);
        return "success";
    }

    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testPathVariable(@PathVariable("id") String sid){
        System.out.println(sid);
        return "success";
    }

    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String header){
        System.out.println(header);
        return "success";
    }

    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/testModuleAttribute")
    public String testModuleAttribute(@ModelAttribute("aaa") User user){
        System.out.println(user);
        return "success";
    }

    /*@ModelAttribute
    public User ModuleAttribute(String username, Integer age){
        User user = new User();
        user.setUname(username);
        user.setAge(age);
        user.setBirthday(new Date());
        return user;
    }
    @ModelAttribute
    public void ModuleAttribute(String username, Integer age, Map<String, User> map){
        User user = new User();
        user.setUname(username);
        user.setAge(age);
        user.setBirthday(new Date());
        map.put("aaa", user);
    }
    **/

    @RequestMapping("/testSetSessionAttributes")
    public String testSetSessionAttributes(Model model){
        model.addAttribute("sessionAttribute001", "美美");
        return "success";
    }
    @RequestMapping("/testDeleteSessionAttributes")
    public String testDeleteSessionAttributes(SessionStatus status){
        status.setComplete();
        return "success";
    }
    @RequestMapping("/testModuleAndView")
    public ModelAndView testModuleAndView(ModelAndView mv){
        mv.addObject("abc", "值为abc");
        mv.setViewName("success");
        return mv;
    }
    @RequestMapping("/testAjax")
    public  String testAjax(User user){
        System.out.println(user);
        user.setAge(55);
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/testException")
    public  String testException() throws SysException {
        try {
            int a = 1/0;
        } catch (Exception e) {
            throw new SysException("查找用户出错");
        }
        return "success";
    }
}
