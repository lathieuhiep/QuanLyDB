package com.neos.qldb;

public class QuanLy {
    private DanhBa[] arrDB;

    public QuanLy() {
        arrDB = new DanhBa[5];
    }

    public boolean KiemTraTonTai(String sdt) {
        for (int i = 0; i < arrDB.length; i++) {
            DanhBa db = arrDB[i];

            if ( db != null && db.getSdt().equals(sdt) ) {
                return true;
            }
        }

        return false;
    }

    public void ThemDanhBa(int index, String ten, String sdt) {
        if (KiemTraTonTai(sdt)) {
            System.out.println("Đã tồn tại SDT này: " + sdt);
            return;
        }

        arrDB[index] = new DanhBa(ten, sdt);
        System.out.println("Thêm thành công sdt:" + sdt + " vào danh bạ!");
    }

    public void inDB() {
        for (int i = 0; i < arrDB.length; i++) {
            DanhBa db = arrDB[i];

            if ( db == null  ) {
                System.out.println("DB " + (i+1) + " Trống!");
            } else {
                System.out.println("DB " + (i + 1) + db);
            }
        }
    }
}
