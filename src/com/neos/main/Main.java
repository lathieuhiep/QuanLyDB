package com.neos.main;

import com.neos.qldb.QuanLy;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();

        quanLy.themDB(0, "Thang", "0123", 12);
        quanLy.themDB(1, "TranThanh", "43534", 15.6);
        quanLy.themDB(2, "Hoai", "0153", 9.7);
        quanLy.themDB(3, "ToHoang", "345345", 20.5);
        quanLy.themDB(4, "ToThang", "435345", 40);
        quanLy.themDB(4, "ToTien", "34534", 40);

//        quanLy.inDB();
//        quanLy.suaDB("1234567890", "11111");

//        quanLy.sxTienTangDan();
        quanLy.timKiemDB("Thang");
    }
}