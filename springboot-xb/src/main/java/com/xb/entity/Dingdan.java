package com.xb.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/5.
 */
@Entity
public class Dingdan implements Serializable {
    private static final long serialVersionUID = -8982630881931201594L;

    @Id
    @GeneratedValue
    private long dingdanid;                        //id
//    @NotBlank(message="用户名不能为空")
    @Column(nullable = false, unique = true)
    private String dingdancount;                      //订单号

    @Column(nullable = false)
    private Date creattime;                    //创建时间
    @Column(nullable = false)
    private String fengkong;                    //风控资料
    @Column(nullable = false)
    private String hetong;                    //合同
    @Column(nullable = false)
    private String dingdanstatus;                    //订单状态
    @Column(nullable = false)
    private String status;                    //区别---状态
    @Column(nullable = false)
    private String yewuyuan;                    //业务员
     @Column(nullable = false)
    private String yaunyin;                    //原因、备注

    @ManyToOne
    private Clientele clientele;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Qudao qudao;
    @ManyToOne
    private Fengkongs fengkongs;

    public Fengkongs getFengkongs() {
        return fengkongs;
    }

    public void setFengkongs(Fengkongs fengkongs) {
        this.fengkongs = fengkongs;
    }

    @Override
    public String toString() {
        return "Dingdan{" +
                "dingdanid=" + dingdanid +
                ", dingdancount='" + dingdancount + '\'' +
                ", creattime=" + creattime +
                ", fengkong='" + fengkong + '\'' +
                ", hetong='" + hetong + '\'' +
                ", dingdanstatus='" + dingdanstatus + '\'' +
                ", status='" + status + '\'' +
                ", yewuyuan='" + yewuyuan + '\'' +
                ", yaunyin='" + yaunyin + '\'' +
                ", clientele=" + clientele +
                ", product=" + product +
                ", qudao=" + qudao +
                ", fengkongs=" + fengkongs +
                '}';
    }

    public long getDingdanid() {
        return dingdanid;
    }

    public void setDingdanid(long dingdanid) {
        this.dingdanid = dingdanid;
    }

    public String getDingdancount() {
        return dingdancount;
    }

    public void setDingdancount(String dingdancount) {
        this.dingdancount = dingdancount;
    }

    public Date getCreattime() {
        return creattime;
    }

    public void setCreattime(Date creattime) {
        this.creattime = creattime;
    }

    public String getFengkong() {
        return fengkong;
    }

    public void setFengkong(String fengkong) {
        this.fengkong = fengkong;
    }

    public String getHetong() {
        return hetong;
    }

    public void setHetong(String hetong) {
        this.hetong = hetong;
    }

    public String getDingdanstatus() {
        return dingdanstatus;
    }

    public void setDingdanstatus(String dingdanstatus) {
        this.dingdanstatus = dingdanstatus;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getYewuyuan() {
        return yewuyuan;
    }

    public void setYewuyuan(String yewuyuan) {
        this.yewuyuan = yewuyuan;
    }

    public String getYaunyin() {
        return yaunyin;
    }

    public void setYaunyin(String yaunyin) {
        this.yaunyin = yaunyin;
    }

    public Clientele getClientele() {
        return clientele;
    }

    public void setClientele(Clientele clientele) {
        this.clientele = clientele;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Qudao getQudao() {
        return qudao;
    }

    public void setQudao(Qudao qudao) {
        this.qudao = qudao;
    }
}
