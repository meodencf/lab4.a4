/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;


import java.util.Arrays;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LopHoc lopHoc = new LopHoc();

 
        DiemHocVien hocVien1 = new DiemHocVien("Nguyễn Văn A", 1998, Arrays.asList(8.0, 7.0, 9.0, 6.0, 8.0));
        DiemHocVien hocVien2 = new DiemHocVien("Trần Thị B", 1999, Arrays.asList(6.0, 5.0, 7.0, 6.0, 6.0));
        DiemHocVien hocVien3 = new DiemHocVien("Lê Văn C", 2000, Arrays.asList(9.0, 8.0, 7.0, 8.0, 9.0));

    
        lopHoc.themHocVien(hocVien1);
        lopHoc.themHocVien(hocVien2);
        lopHoc.themHocVien(hocVien3);

 
        int soLuongLamLuanVan = lopHoc.soLuongLamLuanVan();
        int soLuongThiTotNghiep = lopHoc.soLuongThiTotNghiep();
        int soLuongThiLai = lopHoc.soLuongThiLai();
        List<String> monThiLai = lopHoc.monThiLai();

        System.out.println("Số lượng học viên làm luận văn: " + soLuongLamLuanVan);
        System.out.println("Số lượng học viên thi tốt nghiệp: " + soLuongThiTotNghiep);
        System.out.println("Số lượng học viên phải thi lại: " + soLuongThiLai);
        System.out.println("Danh sách môn thi lại: " + monThiLai);
    }
}

