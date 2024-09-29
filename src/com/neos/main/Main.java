package com.neos.main;

import com.neos.qldb.QuanLy;

public class Main {
    public static void main(String[] args) {
        QuanLy.themDB(0, "Thang", "0123", 12);
        QuanLy.themDB(1, "TranThanh", "43534", 15.6);
        QuanLy.themDB(2, "Hoai", "0153", 9.7);
        QuanLy.themDB(3, "ToHoang", "345345", 20.5);
        QuanLy.themDB(4, "ToThang", "435345", 40);
        QuanLy.themDB(4, "ToTien", "34534", 40);

//        QuanLy.inDB();
//        QuanLy.suaDB("1234567890", "11111");

//        QuanLy.sxTienTangDan();
        QuanLy.timKiemDB("Thang");
    }
}