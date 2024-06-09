package com.neos.qldb;

import java.util.Arrays;
import java.util.Comparator;

public class QuanLy {
    private DanhBa[] arrDB;

    public QuanLy() {
        arrDB = new DanhBa[5];
    }

    public void sxTenTangDan() {
        Comparator<DanhBa> sxTenTD = new Comparator<DanhBa>() {
            @Override
            public int compare(DanhBa db1, DanhBa db2) {
                return db1.getTen().compareTo(db2.getTen());
            }
        };

        Arrays.sort(arrDB, sxTenTD);
        inDB();
    }

    public void sxTienTangDan() {
        Comparator<DanhBa> sxTenTD = new Comparator<DanhBa>() {
            @Override
            public int compare(DanhBa db1, DanhBa db2) {
                double t1 = db1.getTien();
                double t2 = db2.getTien();

                return t1 > t2 ? 1 : (t1 < t2 ? -1 : 0);
            }
        };

        Arrays.sort(arrDB, sxTenTD);
        inDB();
    }

    public int kiemTraTonTai(String sdt) {
        for (int i = 0; i < arrDB.length; i++) {
            DanhBa db = arrDB[i];

            if ( db != null && db.getSdt().equals(sdt) ) {
                return i;
            }
        }

        return -1;
    }

    public void themDB(int index, String ten, String sdt, double tien) {
        if (kiemTraTonTai(sdt) >= 0) {
            System.out.println("Đã tồn tại SDT này: " + sdt);
            return;
        }

        arrDB[index] = new DanhBa(ten, sdt, tien);
        System.out.println("Thêm thành công sdt:" + sdt + " vào danh bạ!");
    }

    public void inDB() {
        System.out.println("Danh bạ của tôi!");

        for (int i = 0; i < arrDB.length; i++) {
            DanhBa db = arrDB[i];

            if ( db == null  ) {
                System.out.println("DB " + (i+1) + " Trống!");
            } else {
                System.out.println("DB " + (i + 1) + " " + db);
            }
        }
    }

    public void suaDB(String sdtCu, String sdtMoi) {
        int viTri = kiemTraTonTai(sdtCu);

        if (viTri == -1) {
            System.out.println("Không tồn tại danh bạ: " + sdtCu);

            return;
        }

        int viTriSDTMoi = kiemTraTonTai(sdtMoi);

        if (viTriSDTMoi >=0 ) {
            System.out.println("Đã tồn tại danh bạ: " + sdtMoi + " => không được phép sửa");
            return;
        }

        arrDB[viTri].setSdt(sdtMoi);
        System.out.println("\nSửa thành công");
        inDB();
    }
}
