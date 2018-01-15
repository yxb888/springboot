package com.xb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
public class Qudao implements Serializable{
    private static final long serialVersionUID = 3597641316333725719L;

    @Id
    @GeneratedValue
    private long qudaoid;                        //id
    @Column(nullable = false, unique = true)
    private String comcayname;                      //公司名称

   @Column(nullable = false)
    private String qudaocode;                      //渠道id
   @Column(nullable = false)
    private String comcayadd;                      //公司地址
   @Column(nullable = false)
    private String lianxiren;                      //联系人
      @Column(nullable = false)
    private String lianxirenphone;                      //联系人电话
    @Column(nullable = false)
    private String qudaolaiyuan;                      //渠道来源

    @Override
    public String toString() {
        return "Qudao{" +
                "qudaoid=" + qudaoid +
                ", comcayname='" + comcayname + '\'' +
                ", qudaocode='" + qudaocode + '\'' +
                ", comcayadd='" + comcayadd + '\'' +
                ", lianxiren='" + lianxiren + '\'' +
                ", lianxirenphone='" + lianxirenphone + '\'' +
                ", qudaolaiyuan='" + qudaolaiyuan + '\'' +
                '}';
    }

    public long getQudaoid() {
        return qudaoid;
    }

    public void setQudaoid(long qudaoid) {
        this.qudaoid = qudaoid;
    }

    public String getComcayname() {
        return comcayname;
    }

    public void setComcayname(String comcayname) {
        this.comcayname = comcayname;
    }

    public String getQudaocode() {
        return qudaocode;
    }

    public void setQudaocode(String qudaocode) {
        this.qudaocode = qudaocode;
    }

    public String getComcayadd() {
        return comcayadd;
    }

    public void setComcayadd(String comcayadd) {
        this.comcayadd = comcayadd;
    }

    public String getLianxiren() {
        return lianxiren;
    }

    public void setLianxiren(String lianxiren) {
        this.lianxiren = lianxiren;
    }

    public String getLianxirenphone() {
        return lianxirenphone;
    }

    public void setLianxirenphone(String lianxirenphone) {
        this.lianxirenphone = lianxirenphone;
    }

    public String getQudaolaiyuan() {
        return qudaolaiyuan;
    }

    public void setQudaolaiyuan(String qudaolaiyuan) {
        this.qudaolaiyuan = qudaolaiyuan;
    }
}
