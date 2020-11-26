package com.entity;

/**
 * 作者：wz
 * 日期: 2020/11/26 15:43
 * 描述:
 */
public class Message {
    private Integer id;
    private Integer fromUid;
    private Integer toUid;
    private String mTitle;
    private String mContent;
    private Integer isRead;
    private String createTime;

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", fromUid=" + fromUid +
                ", toUid=" + toUid +
                ", mTitle='" + mTitle + '\'' +
                ", mContent='" + mContent + '\'' +
                ", isRead=" + isRead +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public Message() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromUid() {
        return fromUid;
    }

    public void setFromUid(Integer fromUid) {
        this.fromUid = fromUid;
    }

    public Integer getToUid() {
        return toUid;
    }

    public void setToUid(Integer toUid) {
        this.toUid = toUid;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmContent() {
        return mContent;
    }

    public void setmContent(String mContent) {
        this.mContent = mContent;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
