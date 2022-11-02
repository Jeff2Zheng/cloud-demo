package jz.example.user.business.menu.item;

import java.util.List;

/**
 * @Author JZ
 * @Date 2022/11/1
 */
public class MenuInitializationItem {

    private Long id;
    private String authLevel;
    private Long parentId;
    private String authRemark;
    private String authPath;
    private List<MenuInitializationItem> children;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<MenuInitializationItem> getChildren() {
        return children;
    }

    public void setChildren(List<MenuInitializationItem> children) {
        this.children = children;
    }
}
