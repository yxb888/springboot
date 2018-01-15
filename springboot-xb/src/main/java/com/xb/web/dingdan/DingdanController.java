package com.xb.web.dingdan;

import com.xb.entity.Clientele;
import com.xb.entity.Dingdan;
import com.xb.service.client.ClientService;
import com.xb.service.dingdan.DingdanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/3.
 */
@Controller
public class DingdanController {
    @Resource
    ClientService clientService;
    @Resource
    DingdanService dingdanService;


    @RequestMapping("/dingdanList")
    public String index() {
        return "dingdan/list";
    }
//打回订单列表
    @RequestMapping("/dingdadanList")
    public String dingdadanList() {
        return "dingdan/dahuilist";
    }
//已拒绝订单列表
    @RequestMapping("/dingjudanList")
    public String dingjudanList() {
        return "dingdan/yijulist";
    }


    @RequestMapping("/dingdanfindAll")
    @ResponseBody
    public   Map<String,Object>  dingdanfindAll(String make,String status,int page,int rows) {
        System.out.println("进入");
        Map<String,Object> persons = dingdanService.findALL(make,status,page,rows);
        System.out.println(persons);
        return persons;
    }

//    修改
    @RequestMapping("/editsDingdan")
    public String editsDingdan( Model model,long dingdanid){
     List<Dingdan> dingdan=  dingdanService.editClient(dingdanid);
        System.out.println(dingdan);
        if(dingdan.size()>0){
        model.addAttribute(dingdan.get(0));
        }else{
            model.addAttribute(dingdan);
        }
        return "dingdan/editDingdan";
    }

//下单
 @RequestMapping("xiadandingdan")
    @ResponseBody
    public void xiadandingdan(Dingdan dingdan){
     dingdanService.updatedingdan(dingdan);

 }
}


