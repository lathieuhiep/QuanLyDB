package com.neos.qldb;

public class DanhBa implements Comparable<DanhBa> {
    private String ten, sdt;
    private double tien;

    public DanhBa(int index, String ten, String sdt, double tien) {
        this.ten = ten;
        this.sdt = sdt;
        this.tien = tien;
    }

    public String getTen() {
        return ten;
    }

    public String getSdt() {
        return sdt;
    }

    public double getTien() {
        return tien;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return ten + ": " + sdt + " : " + tien;
    }

    @Override
    public int compareTo(DanhBa db2) {
        // sx tên tăng dần, sdt giảm dần
        int kq = ten.compareTo(db2.ten);

        if (kq == 0) {
            kq = - sdt.compareTo(db2.sdt);
        }

        return kq;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof DanhBa) {
            return ((DanhBa) obj).sdt.equals(sdt);
        }

        return super.equals(obj);
    }
}
