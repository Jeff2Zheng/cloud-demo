package jz.example.user.jzplatform.config.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import jz.example.user.base.UserBaseModel;
import javax.persistence.Entity;

/**
 * @Description:
 * @Author: JZ
 * @date: 2022/9/6
 */
@Entity
@TableName("sys_config")
public class Config extends UserBaseModel {

    private String siteName;
    private String frontLogo;
    private String backLogo;
    private String copyRight;

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getFrontLogo() {
        return frontLogo;
    }

    public void setFrontLogo(String frontLogo) {
        this.frontLogo = frontLogo;
    }

    public String getBackLogo() {
        return backLogo;
    }

    public void setBackLogo(String backLogo) {
        this.backLogo = backLogo;
    }

    public String getCopyRight() {
        return copyRight;
    }

    public void setCopyRight(String copyRight) {
        this.copyRight = copyRight;
    }
}
