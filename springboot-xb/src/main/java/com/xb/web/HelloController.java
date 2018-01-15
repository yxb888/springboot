package com.xb.web;

import com.xb.rabbit.hello.HelloSender;
import com.xb.rabbit.many.NeoSender;
import com.xb.rabbit.many.NeoSender2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @Autowired
    private HelloSender helloSender;

    @Autowired
    private NeoSender neoSender;

    @Autowired
    private NeoSender2 neoSender2;
    @RequestMapping("/hello")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "hello";
    }

  // 测试 rabbit ----
    @RequestMapping("/sendManysad")
    public void sendManysad() {
        for(int i = 0; i < 10; i++) {
//            neoSender.send(i);
//            neoSender2.send(i);
        }
    }


    public static void main(String[] args) {
        System.out.println("232");
    }

}
