package com.xb.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2018-1-3.
 */
@Entity
public class Clientele implements Serializable {
    private static final long serialVersionUID = -4452219024369275260L;
    @Id
    @GeneratedValue
    private long userid;                        //id
    @NotBlank(message="用户名不能为空")
//    @Column(nullable = false, unique = true)
    @Column(nullable = false)
    private String username;                      //姓名
    @Column(nullable = false)
    private String  phonenumber;                    //电话
    @Column(nullable = false)
    private String usercarid;                    //身份证
    @Column(nullable = false)
    private Integer usersex;                    //性别
    @Column(nullable = false)
    private String Education;                    //学习
    @Column(nullable = false)
    private String marital;                    //婚姻
    @Column(nullable = false)
    private String presentAddress;                    //现在住址
    @Column(nullable = false)
    private String registeredAddress;                    //所在
    @Column(nullable = false)
    private String submitTime;                    //提交时间
    @Column(nullable = false)
    private String productName;                    //产品名称
    @Column(nullable = false)
    private String borrowingLimit;                    //借款额度
    @Column(nullable = false)
    private String borrowingDeadline;                    //借款期限
    @Column(nullable = false)
    private String borrowingRepayment;                    //海宽方式
    @Column(nullable = false)
    private String repaymentFrequency;                    //还款平率
    @Column(nullable = false)
    private String accountnumber;                    //账号
    @Column(nullable = false)
    private String appropriateCrowd;                    //适宜人群
    @Column(nullable = false)
    private String cartype;                    //卡类型
    @Column(nullable = false)
    private String carid;                    //银行卡号
    @Column(nullable = false)
    private String reservedPhoneNumber;                    //预留电话
    @Column(nullable = false)
    private String borrowingMoney;                    //借款金融
    @Column(nullable = false)
    private String borrowingTimeDate;                    //借款期限
    @Column(nullable = false)
    private String modeOfRepayment;                    //还款方式
    @Column(nullable = false)
    private String boorowingAnnual;                    //年利率
     @Column(nullable = false)
    private String jieboorowingAnnual;                    //年利率
   @Column(nullable = false)
    private String qudaoid;                    //渠道id
    @Column(nullable = false)
    private String chanpingType;                    //产品类别
    @Column(nullable = false)
    private String status;                          //  标记 是否黑名单状态
    @Column(nullable = false)
    private String yewuyuan;                          //业务员
    @Column(nullable = false)
    private Date logintime;                          //最新登录时间
      @Column(nullable = false)
    private String madestatus;                          //操作状态

    public String getMadestatus() {
        return madestatus;
    }

    public void setMadestatus(String madestatus) {
        this.madestatus = madestatus;
    }

    public String getJieboorowingAnnual() {
        return jieboorowingAnnual;
    }

    public void setJieboorowingAnnual(String jieboorowingAnnual) {
        this.jieboorowingAnnual = jieboorowingAnnual;
    }

    public String getQudaoid() {
        return qudaoid;
    }

    public void setQudaoid(String qudaoid) {
        this.qudaoid = qudaoid;
    }

    public String getChanpingType() {
        return chanpingType;
    }

    public void setChanpingType(String chanpingType) {
        this.chanpingType = chanpingType;
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

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsercarid() {
        return usercarid;
    }

    public void setUsercarid(String usercarid) {
        this.usercarid = usercarid;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getMarital() {
        return marital;
    }

    public void setMarital(String marital) {
        this.marital = marital;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(String registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(String borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getBorrowingDeadline() {
        return borrowingDeadline;
    }

    public void setBorrowingDeadline(String borrowingDeadline) {
        this.borrowingDeadline = borrowingDeadline;
    }

    public String getBorrowingRepayment() {
        return borrowingRepayment;
    }

    public void setBorrowingRepayment(String borrowingRepayment) {
        this.borrowingRepayment = borrowingRepayment;
    }

    public String getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(String repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAppropriateCrowd() {
        return appropriateCrowd;
    }

    public void setAppropriateCrowd(String appropriateCrowd) {
        this.appropriateCrowd = appropriateCrowd;
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getReservedPhoneNumber() {
        return reservedPhoneNumber;
    }

    public void setReservedPhoneNumber(String reservedPhoneNumber) {
        this.reservedPhoneNumber = reservedPhoneNumber;
    }

    public String getBorrowingMoney() {
        return borrowingMoney;
    }

    public void setBorrowingMoney(String borrowingMoney) {
        this.borrowingMoney = borrowingMoney;
    }

    public String getBorrowingTimeDate() {
        return borrowingTimeDate;
    }

    public void setBorrowingTimeDate(String borrowingTimeDate) {
        this.borrowingTimeDate = borrowingTimeDate;
    }

    public String getModeOfRepayment() {
        return modeOfRepayment;
    }

    public void setModeOfRepayment(String modeOfRepayment) {
        this.modeOfRepayment = modeOfRepayment;
    }

    public String getBoorowingAnnual() {
        return boorowingAnnual;
    }

    public void setBoorowingAnnual(String boorowingAnnual) {
        this.boorowingAnnual = boorowingAnnual;
    }

    @Override
    public String toString() {
        return "Clientele{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", usercarid='" + usercarid + '\'' +
                ", usersex=" + usersex +
                ", Education='" + Education + '\'' +
                ", marital='" + marital + '\'' +
                ", presentAddress='" + presentAddress + '\'' +
                ", registeredAddress='" + registeredAddress + '\'' +
                ", submitTime='" + submitTime + '\'' +
                ", productName='" + productName + '\'' +
                ", borrowingLimit='" + borrowingLimit + '\'' +
                ", borrowingDeadline='" + borrowingDeadline + '\'' +
                ", borrowingRepayment='" + borrowingRepayment + '\'' +
                ", repaymentFrequency='" + repaymentFrequency + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", appropriateCrowd='" + appropriateCrowd + '\'' +
                ", cartype='" + cartype + '\'' +
                ", carid='" + carid + '\'' +
                ", reservedPhoneNumber='" + reservedPhoneNumber + '\'' +
                ", borrowingMoney='" + borrowingMoney + '\'' +
                ", borrowingTimeDate='" + borrowingTimeDate + '\'' +
                ", modeOfRepayment='" + modeOfRepayment + '\'' +
                ", boorowingAnnual='" + boorowingAnnual + '\'' +
                ", jieboorowingAnnual='" + jieboorowingAnnual + '\'' +
                ", qudaoid='" + qudaoid + '\'' +
                ", chanpingType='" + chanpingType + '\'' +
                ", status='" + status + '\'' +
                ", yewuyuan='" + yewuyuan + '\'' +
                ", logintime=" + logintime +
                '}';
    }
}
