package com.neuedu.pojo;

import java.util.Date;

public class Leaguer extends MyPage{
    private Integer gid;

    private String gname;

    private String gsex;

    private String gpwd;

    private Integer gtel;

    private String gaddress;

    private String gemail;

    private Integer gscore;

    private String grank;

    private Date glastlivetime;

    private Date glastordertime;

    private String remarks;

    private Integer active;

    private Date createDate;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGsex() {
        return gsex;
    }

    public void setGsex(String gsex) {
        this.gsex = gsex == null ? null : gsex.trim();
    }

    public String getGpwd() {
        return gpwd;
    }

    public void setGpwd(String gpwd) {
        this.gpwd = gpwd == null ? null : gpwd.trim();
    }

    public Integer getGtel() {
        return gtel;
    }

    public void setGtel(Integer gtel) {
        this.gtel = gtel;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress == null ? null : gaddress.trim();
    }

    public String getGemail() {
        return gemail;
    }

    public void setGemail(String gemail) {
        this.gemail = gemail == null ? null : gemail.trim();
    }

    public Integer getGscore() {
        return gscore;
    }

    public void setGscore(Integer gscore) {
        this.gscore = gscore;
    }

    public String getGrank() {
        return grank;
    }

    public void setGrank(String grank) {
        this.grank = grank == null ? null : grank.trim();
    }

    public Date getGlastlivetime() {
        return glastlivetime;
    }

    public void setGlastlivetime(Date glastlivetime) {
        this.glastlivetime = glastlivetime;
    }

    public Date getGlastordertime() {
        return glastordertime;
    }

    public void setGlastordertime(Date glastordertime) {
        this.glastordertime = glastordertime;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}