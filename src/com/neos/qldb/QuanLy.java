package com.neos.qldb;

import java.util.ArrayList;
import java.util.Objects;

public class QuanLy {
    private ArrayList<DanhBa> listDB;

    public QuanLy() {
        listDB = new ArrayList<DanhBa>();
    }

    // sx ten tang dan
//    public void sxTenTangDan() {
//        Comparator<DanhBa> sxTenTD = new Comparator<DanhBa>() {
//            @Override
//            public int compare(DanhBa db1, DanhBa db2) {
//                return db1.getTen().compareTo(db2.getTen());
//            }
//        };
//
//        Arrays.sort(arrDB, sxTenTD);
//        inDB();
//    }

    // sx tien tang dan
//    public void sxTienTangDan() {
//        Comparator<DanhBa> sxTenTD = new Comparator<DanhBa>() {
//            @Override
//            public int compare(DanhBa db1, DanhBa db2) {
//                double t1 = db1.getTien();
//                double t2 = db2.getTien();
//
//                return t1 > t2 ? 1 : (t1 < t2 ? -1 : 0);
//            }
//        };
//
//        Arrays.sort(arrDB, sxTenTD);
//        inDB();
//    }

    // kiem tra ton tai
    public boolean kiemTraTonTai(String sdt) {
        for (int i = 0; i < listDB.size(); i++) {
            DanhBa danhBa = listDB.get(i);

            if ( danhBa.getSdt().equals(sdt) ) {
                return true;
            }
        }
        return false;
    }

    // thêm danh bạ
    public void themDB(int index, String ten, String sdt, double tien) {
        DanhBa danhBa = new DanhBa(index, ten, sdt, tien);

        if ( kiemTraTonTai(sdt) ) {
            System.err.println("Err: Đã tồn tại SDT này: " + sdt);
        } else {
            listDB.add(danhBa);
            System.out.println("Thêm thành công sdt:" + sdt + " vào danh bạ!");
        }
    }

    // in danh bạ
    public void inDB() {
        System.out.println("Danh bạ của tôi!");
        System.out.println(listDB);
    }

    // sửa danh bạ
    public void suaDB(String sdtCu, String sdtMoi) {
        if (kiemTraTonTai(sdtMoi)) {
            System.out.println("Số điện thoại mới đã tồn tại trong danh bạ");
            return;
        }

        for (int i = 0; i < listDB.size(); i++) {
            DanhBa danhBa = listDB.get(i);

            if ( danhBa.getSdt().equals(sdtCu) ) {
                danhBa.setSdt(sdtMoi);
                System.out.println("Đã sửa số điện thoại thành công");

                inDB();

                return;
            }
        }

        System.out.println("Không tìm thấy số điện thoại cần sửa");
    }

    // tìm kiếm danh bạ
    public void timKiemDB(String gtTen) {
        System.out.println("Kết quả tìm kiếm:");

        for (int i = 0; i < listDB.size(); i++) {
            DanhBa danhBa = listDB.get(i);
            String tenDB = danhBa.getTen();

//            for (int j = 0; j < tenDB.length(); j++) {
//                char nam = tenDB.charAt(j);
//                char namNext = tenDB.charAt(j+ 1);
//                System.out.println(tenDB.charAt(j));
//
//            }
        }
    }
}
