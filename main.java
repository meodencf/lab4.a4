/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

/**
 *
 * @author MINHNHAT
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        QuanLyGiaoDich quanLy = new QuanLyGiaoDich();
        
        quanLy.nhapDanhSachGiaoDich();
        quanLy.xuatDanhSachGiaoDich();
        
        int soLuongLoaiADat = quanLy.demSoLuongLoaiDat("A");
        System.out.println("Số lượng giao dịch đất loại A: " + soLuongLoaiADat);
        
        double trungBinhThanhTienDat = quanLy.tinhTrungBinhThanhTienDat();
        System.out.println("Trung bình thành tiền giao dịch đất: " + trungBinhThanhTienDat);
        
        List<GiaoDich> giaoDichThang9Nam2013 = quanLy.timGiaoDichThang9Nam2013();
        System.out.println("Các giao dịch tháng 9 năm 2013:");
        for (GiaoDich giaoDich : giaoDichThang9Nam2013) {
            System.out.println("Mã giao dịch: " + giaoDich.maGiaoDich);
            System.out.println("Ngày giao dịch: " + giaoDich.ngayGiaoDich);
            System.out.println("-------------------------");
        }
    }
}
