package com.neuedu.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class GoodsType extends MyPage implements Serializable {
    private Integer id;

    private String goodsTypename;

    private String goodsTypenotes;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Integer active;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsTypename() {
        return goodsTypename;
    }

    public void setGoodsTypename(String goodsTypename) {
        this.goodsTypename = goodsTypename == null ? null : goodsTypename.trim();
    }

    public String getGoodsTypenotes() {
        return goodsTypenotes;
    }

    public void setGoodsTypenotes(String goodsTypenotes) {
        this.goodsTypenotes = goodsTypenotes == null ? null : goodsTypenotes.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }
}