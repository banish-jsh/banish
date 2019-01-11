package com.yy.design.banish.dao.model;

import java.util.Date;

public class UserCryptDO {
    private Integer id;

    private String uid;

    private String privkey;

    private String pubkey;

    private Date gmtCreated;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getPrivkey() {
        return privkey;
    }

    public void setPrivkey(String privkey) {
        this.privkey = privkey == null ? null : privkey.trim();
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey == null ? null : pubkey.trim();
    }

    public Date getGmtCreated() {
        return gmtCreated;
    }

    public void setGmtCreated(Date gmtCreated) {
        this.gmtCreated = gmtCreated;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}