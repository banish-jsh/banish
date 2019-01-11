package com.yy.design.banish.dao.model;

import java.util.Date;

public class MenuDO {
    private Integer id;

    private Integer parentId;

    private String menuName;

    private String menuDesc;

    private String menuData;

    private String menuAttribute;

    private Integer isLeaf;

    private Integer isPermit;

    private Integer status;

    private Date gmtCreated;

    private Date gmtModified;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }

    public String getMenuData() {
        return menuData;
    }

    public void setMenuData(String menuData) {
        this.menuData = menuData == null ? null : menuData.trim();
    }

    public String getMenuAttribute() {
        return menuAttribute;
    }

    public void setMenuAttribute(String menuAttribute) {
        this.menuAttribute = menuAttribute == null ? null : menuAttribute.trim();
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public Integer getIsPermit() {
        return isPermit;
    }

    public void setIsPermit(Integer isPermit) {
        this.isPermit = isPermit;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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