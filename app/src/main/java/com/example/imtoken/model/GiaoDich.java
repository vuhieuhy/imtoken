package com.example.imtoken.model;

public class GiaoDich {
    private int giaoDichId;
    private int imgGdId;
    private String tenGiaoDich;
    private String dateGiaoDich;
    private String tienGiaoDich;

    public GiaoDich(int giaoDichId, int imgGdId, String tenGiaoDich, String dateGiaoDich, String tienGiaoDich) {
        this.giaoDichId = giaoDichId;
        this.imgGdId = imgGdId;
        this.tenGiaoDich = tenGiaoDich;
        this.dateGiaoDich = dateGiaoDich;
        this.tienGiaoDich = tienGiaoDich;
    }

    public int getGiaoDichId() {
        return giaoDichId;
    }

    public void setGiaoDichId(int giaoDichId) {
        this.giaoDichId = giaoDichId;
    }

    public int getImgGdId() {
        return imgGdId;
    }

    public void setImgGdId(int imgGdId) {
        this.imgGdId = imgGdId;
    }

    public String getTenGiaoDich() {
        return tenGiaoDich;
    }

    public void setTenGiaoDich(String tenGiaoDich) {
        this.tenGiaoDich = tenGiaoDich;
    }

    public String getDateGiaoDich() {
        return dateGiaoDich;
    }

    public void setDateGiaoDich(String dateGiaoDich) {
        this.dateGiaoDich = dateGiaoDich;
    }

    public String getTienGiaoDich() {
        return tienGiaoDich;
    }

    public void setTienGiaoDich(String tienGiaoDich) {
        this.tienGiaoDich = tienGiaoDich;
    }
}
