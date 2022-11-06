package jz.example.user.business.juc.item;

import jz.example.user.base.UserBasePage;

/**
 * @Author JZ
 * @Date 2022/3/25
 */
public class JucQueryPageItem extends UserBasePage<JucQueryPageItem> {

    private String jucName;
    private String jucType;
    private String jucUrl;
    private String jucImportant;
    private String jucFileId;

    public JucQueryPageItem(long current, long size) {
        super(current, size);
    }

    public String getJucName() {
        return jucName;
    }

    public void setJucName(String jucName) {
        this.jucName = jucName;
    }

    public String getJucType() {
        return jucType;
    }

    public void setJucType(String jucType) {
        this.jucType = jucType;
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
