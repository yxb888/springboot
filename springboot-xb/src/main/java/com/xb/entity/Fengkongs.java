package com.xb.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018/1/9.
 */
@Entity
public class Fengkongs  implements Serializable{
    private static final long serialVersionUID = 6233769617618879875L;


    @javax.persistence.Id
    @GeneratedValue
    private  long fengid ;
//    工作信息
    @Column(nullable = false, unique = true)
    private String comname;                      //公司名称
    @Column(nullable = false)
    private String comxingzhi;                      //公司性质
    @Column(nullable = false)
    private String comtel;                      //公司电话
    @Column(nullable = false)
    private String comadd;                      //公司地址
    @Column(nullable = false)
    private String combumen;                      //部门
    @Column(nullable = false)
    private String comzhiwei;                      //职位
    @Column(nullable = false)
    private String comshouru;                      //月收入水平
    @Column(nullable = false)
    private String comshebao;                      //社保
     @Column(nullable = false)
    private Date comruzhitime;                      //入职时间

    @Column(nullable = false)
    private String zhiyexz;                      //职业性质
    @Column(nullable = false)
    private String zhuyiyw;                      //主营业务
//     资产信息
    @Column(nullable = false)
    private String fc;                      //房产
    @Column(nullable = false)
    private String fccount;                      //房产数量
    @Column(nullable = false)
    private Date fcmaitime;                      //购买时间

    @Column(nullable = false)
    private String fmway;                      //购买方式
    @Column(nullable = false)
    private String gmpase;                      //购买价格
    @Column(nullable = false)
    private String fzgsr;                      //房产归属人
    @Column(nullable = false)
    private String fzadd;                      //房产地址
    @Column(nullable = false)
    private String car;                      //汽车
    @Column(nullable = false)
    private String carcount;                      //汽车数量
    @Column(nullable = false)
    private Date qcmaitime;                      //汽车购买时间
    @Column(nullable = false)
    private String qcmaiway;                      //汽车购买方式
    @Column(nullable = false)
    private String qcmaipases;                      //汽车购买价格
    @Column(nullable = false)
    private String qcgsr;                      //汽车归属人

//    联系人信息
    @Column(nullable = false)
    private String poname;                      //配偶姓名
    @Column(nullable = false)
    private String phone;                      //手机号
    @Column(nullable = false)
    private String zxqr;                      //直系亲人
    @Column(nullable = false)
    private String qcgsrphone;                      //直系亲人手机号
    @Column(nullable = false)
    private String qtlxr;                      //其他联系人
    @Column(nullable = false)
    private String qtlxrphone;                      //其他联系人手机号

    @Override
    public String toString() {
        return "Fengkongs{" +
                "fengid=" + fengid +
                ", comname='" + comname + '\'' +
                ", comxingzhi='" + comxingzhi + '\'' +
                ", comtel='" + comtel + '\'' +
                ", comadd='" + comadd + '\'' +
                ", combumen='" + combumen + '\'' +
                ", comzhiwei='" + comzhiwei + '\'' +
                ", comshouru='" + comshouru + '\'' +
                ", comshebao='" + comshebao + '\'' +
                ", comruzhitime=" + comruzhitime +
                ", zhiyexz='" + zhiyexz + '\'' +
                ", zhuyiyw='" + zhuyiyw + '\'' +
                ", fc='" + fc + '\'' +
                ", fccount='" + fccount + '\'' +
                ", fcmaitime=" + fcmaitime +
                ", fmway='" + fmway + '\'' +
                ", gmpase='" + gmpase + '\'' +
                ", fzgsr='" + fzgsr + '\'' +
                ", fzadd='" + fzadd + '\'' +
                ", car='" + car + '\'' +
                ", carcount='" + carcount + '\'' +
                ", qcmaitime=" + qcmaitime +
                ", qcmaiway='" + qcmaiway + '\'' +
                ", qcmaipases='" + qcmaipases + '\'' +
                ", qcgsr='" + qcgsr + '\'' +
                ", poname='" + poname + '\'' +
                ", phone='" + phone + '\'' +
                ", zxqr='" + zxqr + '\'' +
                ", qcgsrphone='" + qcgsrphone + '\'' +
                ", qtlxr='" + qtlxr + '\'' +
                ", qtlxrphone='" + qtlxrphone + '\'' +
                '}';
    }

    public long getFengid() {
        return fengid;
    }

    public void setFengid(long fengid) {
        this.fengid = fengid;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getComxingzhi() {
        return comxingzhi;
    }

    public void setComxingzhi(String comxingzhi) {
        this.comxingzhi = comxingzhi;
    }

    public String getComtel() {
        return comtel;
    }

    public void setComtel(String comtel) {
        this.comtel = comtel;
    }

    public String getComadd() {
        return comadd;
    }

    public void setComadd(String comadd) {
        this.comadd = comadd;
    }

    public String getCombumen() {
        return combumen;
    }

    public void setCombumen(String combumen) {
        this.combumen = combumen;
    }

    public String getComzhiwei() {
        return comzhiwei;
    }

    public void setComzhiwei(String comzhiwei) {
        this.comzhiwei = comzhiwei;
    }

    public String getComshouru() {
        return comshouru;
    }

    public void setComshouru(String comshouru) {
        this.comshouru = comshouru;
    }

    public String getComshebao() {
        return comshebao;
    }

    public void setComshebao(String comshebao) {
        this.comshebao = comshebao;
    }

    public Date getComruzhitime() {
        return comruzhitime;
    }

    public void setComruzhitime(Date comruzhitime) {
        this.comruzhitime = comruzhitime;
    }

    public String getZhiyexz() {
        return zhiyexz;
    }

    public void setZhiyexz(String zhiyexz) {
        this.zhiyexz = zhiyexz;
    }

    public String getZhuyiyw() {
        return zhuyiyw;
    }

    public void setZhuyiyw(String zhuyiyw) {
        this.zhuyiyw = zhuyiyw;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getFccount() {
        return fccount;
    }

    public void setFccount(String fccount) {
        this.fccount = fccount;
    }

    public Date getFcmaitime() {
        return fcmaitime;
    }

    public void setFcmaitime(Date fcmaitime) {
        this.fcmaitime = fcmaitime;
    }

    public String getFmway() {
        return fmway;
    }

    public void setFmway(String fmway) {
        this.fmway = fmway;
    }

    public String getGmpase() {
        return gmpase;
    }

    public void setGmpase(String gmpase) {
        this.gmpase = gmpase;
    }

    public String getFzgsr() {
        return fzgsr;
    }

    public void setFzgsr(String fzgsr) {
        this.fzgsr = fzgsr;
    }

    public String getFzadd() {
        return fzadd;
    }

    public void setFzadd(String fzadd) {
        this.fzadd = fzadd;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarcount() {
        return carcount;
    }

    public void setCarcount(String carcount) {
        this.carcount = carcount;
    }

    public Date getQcmaitime() {
        return qcmaitime;
    }

    public void setQcmaitime(Date qcmaitime) {
        this.qcmaitime = qcmaitime;
    }

    public String getQcmaiway() {
        return qcmaiway;
    }

    public void setQcmaiway(String qcmaiway) {
        this.qcmaiway = qcmaiway;
    }

    public String getQcmaipases() {
        return qcmaipases;
    }

    public void setQcmaipases(String qcmaipases) {
        this.qcmaipases = qcmaipases;
    }

    public String getQcgsr() {
        return qcgsr;
    }

    public void setQcgsr(String qcgsr) {
        this.qcgsr = qcgsr;
    }

    public String getPoname() {
        return poname;
    }

    public void setPoname(String poname) {
        this.poname = poname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZxqr() {
        return zxqr;
    }

    public void setZxqr(String zxqr) {
        this.zxqr = zxqr;
    }

    public String getQcgsrphone() {
        return qcgsrphone;
    }

    public void setQcgsrphone(String qcgsrphone) {
        this.qcgsrphone = qcgsrphone;
    }

    public String getQtlxr() {
        return qtlxr;
    }

    public void setQtlxr(String qtlxr) {
        this.qtlxr = qtlxr;
    }

    public String getQtlxrphone() {
        return qtlxrphone;
    }

    public void setQtlxrphone(String qtlxrphone) {
        this.qtlxrphone = qtlxrphone;
    }
}
