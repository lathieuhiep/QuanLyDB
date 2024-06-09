package com.neos.main;

import com.neos.qldb.QuanLy;

public class Main {
    public static void main(String[] args) {
        QuanLy quanLy = new QuanLy();

        quanLy.themDB(0, "Thang", "123");
        quanLy.themDB(1, "TranThanh", "43534");
//        quanLy.themDB(2, "Hoai", "0153");
        quanLy.themDB(3, "ToHoang", "345345");
        quanLy.themDB(4, "ToThang", "43534");
        quanLy.themDB(4, "ToTien", "34534");

        quanLy.inDB();
        quanLy.suaDB("43534", "11111");
    }
}