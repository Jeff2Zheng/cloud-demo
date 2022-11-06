package jz.example.user.business.juc.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import jz.example.user.base.UserBaseModel;

import javax.persistence.Entity;

/**
 * @Author JZ
 * @Date 2022/10/26
 */
@Entity
@TableName("jz_juc")
public class Juc extends UserBaseModel {

    private String jucType;
    private String jucName;
    private String jucUrl;
    private String jucImportant;
    private String jucFileId;

    public String getJucType() {
        return jucType;
    }

    public void setJucType(String jucType) {
        this.jucType = jucType;
    }

    public String getJucName() {
        return jucName;
    }

    public void setJucName(String jucName) {
        this.jucName = jucName;
    }

    public String getJucUrl() {
        return jucUrl;
    }

    public void setJucUrl(String jucUrl) {
        this.jucUrl = jucUrl;
    }

    public String getJucImportant() {
        return jucImportant;
    }

    public void setJucImportant(String jucImportant) {
        this.jucImportant = jucImportant;
    }

    public String getJucFileId() {
        return jucFileId;
    }

    public void setJucFileId(String jucFileId) {
        this.jucFileId = jucFileId;
    }
}
