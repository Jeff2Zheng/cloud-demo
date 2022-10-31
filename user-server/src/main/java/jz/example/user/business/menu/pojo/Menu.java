package jz.example.user.business.menu.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import jz.example.user.base.UserBaseModel;

import javax.persistence.Entity;

/**
 * @Author JZ
 * @Date 2022/10/26
 */
@Entity
@TableName("jz_menu")
public class Menu extends UserBaseModel {

    private String authLevel;
    private Long parentId;
    private String authRemark;
    private String authPath;

    public String getAuthLevel() {
        return authLevel;
    }

    public void setAuthLevel(String authLevel) {
        this.authLevel = authLevel;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getAuthRemark() {
        return authRemark;
    }

    public void setAuthRemark(String authRemark) {
        this.authRemark = authRemark;
    }

    public String getAuthPath() {
        return authPath;
    }

    public void setAuthPath(String authPath) {
        this.authPath = authPath;
    }
}
