package com.xb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/5.
 */

@Document(collection = "Productss")
public class Productss {

    private String id;                        //id
    private String productname;                      //产品名称
    private String producttype;                      //产品类别
    private String productstatus;                      //产品状太
    private Date creatime;                      //开通时间
    private String productlaiyuan;                      //产品来源


    @Override
    public String toString() {
        return "Productss{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", producttype='" + producttype + '\'' +
                ", productstatus='" + productstatus + '\'' +
                ", creatime=" + creatime +
                ", productlaiyuan='" + productlaiyuan + '\'' +
                '}';
    }

    public String getId() {

        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProducttype() {
        return producttype;
    }

    public void setProducttype(String producttype) {
        this.producttype = producttype;
    }

    public String getProductstatus() {
        return productstatus;
    }

    public void setProductstatus(String productstatus) {
        this.productstatus = productstatus;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }

    public String getProductlaiyuan() {
        return productlaiyuan;
    }

    public void setProductlaiyuan(String productlaiyuan) {
        this.productlaiyuan = productlaiyuan;
    }
}
