package jz.example.user.demo.pojo;

import jz.example.user.base.UserBaseModel;

/**
 * @Author JZ
 * @Date 2022/3/13
 */
//@Entity
//@TableName("jz_company")
public class Company extends UserBaseModel {

    private String companyName;
    private String companyAddress;
    private String busilicense;

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
