package com.cybersoft.demospringboot03.entity;

public class Student {
    private String hoten;
    private int tuoi;

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTuoi() {
        return tuoi;
    }



    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    @Override
    public String toString() {
        return "StrudenController{" +
                "hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }

}
