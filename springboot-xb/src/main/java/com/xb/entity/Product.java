package com.xb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = -1637815823567905465L;

    @Id
    @GeneratedValue
    private long productid;                        //id
    @Column(nullable = false)
    private String productname;                      //产品名称
    @Column(nullable = false)
    private String producttype;                      //产品类别
    @Column(nullable = false)
    private String productstatus;                      //产品状太
    @Column(nullable = false)
    private Date creatime;                      //开通时间
    @Column(nullable = false)
    private String productlaiyuan;                      //产品来源

    @Override
    public String toString() {
        return "Product{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", producttype='" + producttype + '\'' +
                ", productstatus='" + productstatus + '\'' +
                ", creatime=" + creatime +
                ", productlaiyuan='" + productlaiyuan + '\'' +
                '}';
    }

    public long getProductid() {
        return productid;
    }

    public void setProductid(long productid) {
        this.productid = productid;
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
