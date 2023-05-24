/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyGiaoDich {
    private List<GiaoDich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void themGiaoDich(GiaoDich giaoDich) {
        danhSachGiaoDich.add(giaoDich);
    }

    public int demSoLuongLoaiDat(String loaiDat) {
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                GiaoDichDat giaoDichDat = (GiaoDichDat) giaoDich;
                if (giaoDichDat.loaiDat.equals(loaiDat)) {
                    count++;
                }
            }
        }
        return count;
    }

    public double tinhTrungBinhThanhTienDat() {
        double sum = 0;
        int count = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                GiaoDichDat giaoDichDat = (GiaoDichDat) giaoDich;
                sum += giaoDichDat.tinhThanhTien();
                count++;
            }
        }
        if (count > 0) {
            return sum / count;
        } else {
            return 0;
        }
    }

    public List<GiaoDich> timGiaoDichThang9Nam2013() {
        List<GiaoDich> ketQua = new ArrayList<>();
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngayGiaoDich.startsWith("09/") && giaoDich.ngayGiaoDich.endsWith("/2013")) {
                ketQua.add(giaoDich);
            }
        }
        return ketQua;
    }

    public void nhapDanhSachGiaoDich() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng giao dịch: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ ký tự xuống dòng sau lệnh nextInt()

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhập thông tin cho giao dịch thứ " + (i + 1) + ":");
            System.out.print("Loại giao dịch (dat/nha): ");
            String loaiGiaoDich = scanner.nextLine();

            System.out.print("Mã giao dịch: ");
            String maGiaoDich = scanner.nextLine();

            System.out.print("Ngày giao dịch (dd/mm/yyyy): ");
            String ngayGiaoDich = scanner.nextLine();

            System.out.print("Đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng sau lệnh nextDouble()

            System.out.print("Diện tích: ");
            double dienTich = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ ký tự xuống dòng sau lệnh nextDouble()

            if (loaiGiaoDich.equals("dat")) {
                System.out.print("Loại đất (A/B/C): ");
                String loaiDat = scanner.nextLine();

                GiaoDichDat giaoDichDat = new GiaoDichDat(maGiaoDich, ngayGiaoDich, donGia, loaiDat, dienTich);
                themGiaoDich(giaoDichDat);
            } else if (loaiGiaoDich.equals("nha")) {
                System.out.print("Loại nhà (cao cap/thuong): ");
                String loaiNha = scanner.nextLine();

                System.out.print("Địa chỉ: ");
                String diaChi = scanner.nextLine();

                GiaoDichNha giaoDichNha = new GiaoDichNha(maGiaoDich, ngayGiaoDich, donGia, loaiNha, diaChi, dienTich);
                themGiaoDich(giaoDichNha);
            } else {
                System.out.println("Loại giao dịch không hợp lệ.");
            }
        }
    }

    public void xuatDanhSachGiaoDich() {
        System.out.println("Danh sách giao dịch:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            System.out.println("Mã giao dịch: " + giaoDich.maGiaoDich);
            System.out.println("Ngày giao dịch: " + giaoDich.ngayGiaoDich);
            System.out.println("Đơn giá: " + giaoDich.donGia);
            System.out.println("Diện tích: " + giaoDich.dienTich);

            if (giaoDich instanceof GiaoDichDat) {
                GiaoDichDat giaoDichDat = (GiaoDichDat) giaoDich;
                System.out.println("Loại đất: " + giaoDichDat.loaiDat);
                System.out.println("Thành tiền: " + giaoDichDat.tinhThanhTien());
            } else if (giaoDich instanceof GiaoDichNha) {
                GiaoDichNha giaoDichNha = (GiaoDichNha) giaoDich;
                System.out.println("Loại nhà: " + giaoDichNha.loaiNha);
                System.out.println("Địa chỉ: " + giaoDichNha.diaChi);
                System.out.println("Thành tiền: " + giaoDichNha.tinhThanhTien());
            }

            System.out.println("-------------------------");
        }
    }

}
