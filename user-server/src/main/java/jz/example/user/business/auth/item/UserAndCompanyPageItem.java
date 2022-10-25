package jz.example.user.business.auth.item;

import jz.example.user.base.UserBasePage;

import java.util.Date;

/**
 * @Author JZ
 * @Date 2022/3/25
 */
public class UserAndCompanyPageItem extends UserBasePage<UserAndCompanyPageItem> {

    private Long companyId;
    private String mobile;
    private String userId;
    private String email;
    private String pwd;
    private String sex;
    private String name;
    private String idCardNo;
    private String registerIp;
    private Date lastLoginTime;
    private Date loginTime;
    private String companyName;
    private String companyAddress;
    private String busilicense;


    public UserAndCompanyPageItem(long current, long size) {
        super(current, size);
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getBusilicense() {
        return busilicense;
    }

    public void setBusilicense(String busilicense) {
        this.busilicense = busilicense;
    }
}
