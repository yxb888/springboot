package com.xb.web.product;

import com.xb.entity.Product;
import com.xb.entity.Productss;
import com.xb.service.product.ProductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/11.
 */
@Controller
public class ProductController {

    @Autowired
    ProductorService productorService;
    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping("/toproductList")
    public String toproductList(){

        return "product/list";
    }


    @RequestMapping("/productList")
    @ResponseBody
    public Map<String, Object> productList(int page , int rows){
        Query query = new Query();
        int start = (page-1)*rows;
        query.skip(start);
        query.limit(rows);
        int total =  (int) mongoTemplate.count(new Query(), Productss.class);
        query.with(new Sort(Sort.Direction.DESC,"id"));
        System.out.println(query.toString());
        List<Productss> productss = mongoTemplate.find(query, Productss.class,"Productss");
        Map<String, Object> map2 = new HashMap<String, Object>();
        map2.put("rows",productss);
        map2.put("total",total );
        return map2;
    }
@RequestMapping("/deleteProductormog")
@ResponseBody
public void deleteProductormog(String productid){
    Productss s=new Productss();
    s.setId(productid);
    mongoTemplate.remove(s);
//    mongoTemplate.findAllAndRemove(new Query(Criteria.where("productid").is(product.getProductid())),Product.class,"product");
}
    @RequestMapping("/saveProduct")
    public String saveProduct(){
        Productss s=new Productss();
        s.setId("1");
        s.setCreatime(new Date());
        s.setProductlaiyuan("123");
        s.setProductstatus("2");
        s.setProductname("weixuan");
        s.setProducttype("1");
        mongoTemplate.save(s);

        return "product/productList";
    }

}
