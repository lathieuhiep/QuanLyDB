package com.neos.main;

import com.neos.qldb.QuanLy;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();

        quanLy.themDB(0, "Thang", "123", 12);
        quanLy.themDB(1, "TranThanh", "12345", 15.6);
        quanLy.themDB(2, "ToHoang", "345245", 9.7);
        quanLy.themDB(3, "ToThang", "43534", 20.5);
        quanLy.themDB(4, "ToTien", "34534", 40);

//        quanLy.inDB();
//        quanLy.suaDB("43534", "11111");

        quanLy.sxTienTangDan();
        quanLy.timKiemDB("Thang");
    }
}