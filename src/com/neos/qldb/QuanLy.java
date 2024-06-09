package com.neos.qldb;

public class QuanLy {
    private DanhBa[] arrDB;

    public QuanLy() {
        arrDB = new DanhBa[5];
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

    public void themDB(int index, String ten, String sdt) {
        if (kiemTraTonTai(sdt) >= 0) {
            System.out.println("Đã tồn tại SDT này: " + sdt);
            return;
        }

        arrDB[index] = new DanhBa(ten, sdt);
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
