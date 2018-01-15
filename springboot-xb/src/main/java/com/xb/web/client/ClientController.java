package com.xb.web.client;

import com.xb.entity.Clientele;
import com.xb.service.client.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/3.
 */
@Controller
public class ClientController {
    @Resource
    ClientService clientService;


    @RequestMapping("/clientList")
    public String index() {
        return "client/list";
    }
    @RequestMapping("/clientheiList")
    public String clientheiList() {
        return "client/blacklist";
    }

    @RequestMapping("/clientfindAll")
    @ResponseBody
    public   Map<String,Object>  clientfindAll(String make,int page,int rows) {
        System.out.println("进入");
        Map<String,Object> persons = clientService.findALL(make,page,rows);
        return persons;
    }

//    修改
    @RequestMapping("/editClient")
    public String editClient( Model model,long userid){

     Clientele clientele=  clientService.editClient(userid);
        System.out.println(clientele.getUsername());
        model.addAttribute(clientele);

            return "client/editClient";
    }
    @RequestMapping("/saveClient")
    @ResponseBody
    public void saveClient(@Valid Clientele clientele){
        clientService.saveClient(clientele);
    }

    //    跳新增
    @RequestMapping("/showListadd")
    public String showListadd(){
        return "client/addClient";
    }
    @RequestMapping("/saveinsertClient")
    @ResponseBody
    public void saveinsertClient(Clientele clientele){
        clientService.saveinsertClient(clientele);
    }


    //    黑名单---------------------------------------------------
    @RequestMapping("/clientheifindAll")
    @ResponseBody
    public   Map<String,Object>  clientheifindAll(String make,int page,int rows) {
        Map<String,Object> persons = clientService.clientheifindAll(make,page,rows);
        return persons;
    }


}


