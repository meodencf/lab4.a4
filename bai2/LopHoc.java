/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;


import java.util.ArrayList;
import java.util.List;

public class LopHoc {
    private List<DiemHocVien> danhSachHocVien;

    public LopHoc() {
        this.danhSachHocVien = new ArrayList<>();
    }

    public void themHocVien(DiemHocVien hocVien) {
        danhSachHocVien.add(hocVien);
    }

    public int soLuongLamLuanVan() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coLamLuanVan()) {
                count++;
            }
        }
        return count;
    }

    public int soLuongThiTotNghiep() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiTotNghiep()) {
                count++;
            }
        }
        return count;
    }

    public int soLuongThiLai() {
        int count = 0;
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiLai()) {
                count++;
            }
        }
        return count;
    }

    public List<String> monThiLai() {
        List<String> monThiLai = new ArrayList<>();
        for (DiemHocVien hocVien : danhSachHocVien) {
            if (hocVien.coThiLai()) {
                monThiLai.addAll(hocVien.monThiLai());
            }
        }
        return monThiLai;
    }


   
}
