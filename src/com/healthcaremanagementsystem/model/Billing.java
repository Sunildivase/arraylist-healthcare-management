package com.healthcaremanagementsystem.model;

public class Billing {

    private int bId;
    private int personId;
    private int bill;
    private int totalBill;

    @Override
    public String toString() {
        return "Billing{" +
                "bId=" + bId +
                ", personId=" + personId +
                ", bill=" + bill +
                ", totalBill=" + totalBill +
                '}';
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }
}
