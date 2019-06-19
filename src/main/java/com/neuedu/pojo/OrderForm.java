package com.neuedu.pojo;

import java.util.Date;

public class OrderForm extends MyPage{
    private Integer id;

    private Integer roomId;

    private Long roomPrice;

    private Long deposit;

    private Integer livedDays;

    private Long livedPrice;

    private Long roomBill;

    private Long foodBill;

    private Long telBill;

    private Long totalBill;

    private Long rebackDeposit;

    private String payStyle;

    private Long realWages;

    private Long oddChange;

    private String user;

    private String remarks;

    private Integer active;

    private Date createDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Long getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Long roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Long getDeposit() {
        return deposit;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public Integer getLivedDays() {
        return livedDays;
    }

    public void setLivedDays(Integer livedDays) {
        this.livedDays = livedDays;
    }

    public Long getLivedPrice() {
        return livedPrice;
    }

    public void setLivedPrice(Long livedPrice) {
        this.livedPrice = livedPrice;
    }

    public Long getRoomBill() {
        return roomBill;
    }

    public void setRoomBill(Long roomBill) {
        this.roomBill = roomBill;
    }

    public Long getFoodBill() {
        return foodBill;
    }

    public void setFoodBill(Long foodBill) {
        this.foodBill = foodBill;
    }

    public Long getTelBill() {
        return telBill;
    }

    public void setTelBill(Long telBill) {
        this.telBill = telBill;
    }

    public Long getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(Long totalBill) {
        this.totalBill = totalBill;
    }

    public Long getRebackDeposit() {
        return rebackDeposit;
    }

    public void setRebackDeposit(Long rebackDeposit) {
        this.rebackDeposit = rebackDeposit;
    }

    public String getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(String payStyle) {
        this.payStyle = payStyle == null ? null : payStyle.trim();
    }

    public Long getRealWages() {
        return realWages;
    }

    public void setRealWages(Long realWages) {
        this.realWages = realWages;
    }

    public Long getOddChange() {
        return oddChange;
    }

    public void setOddChange(Long oddChange) {
        this.oddChange = oddChange;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
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