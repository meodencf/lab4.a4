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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 class QuanLyGiaoDich {
    private List<Giaodich> danhSachGiaoDich;

    public QuanLyGiaoDich() {
        danhSachGiaoDich = new ArrayList<>();
    }

    public void nhapDanhSachGiaoDich() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng giao dịch: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < soLuong; i++) {
            System.out.print("Nhập loại giao dịch (dat/nha): ");
            String loaiGD = scanner.nextLine();

            System.out.print("Nhập mã giao dịch: ");
            String maGD = scanner.nextLine();

            System.out.print("Nhập ngày giao dịch (ngày/tháng/năm): ");
            String ngayGD = scanner.nextLine();

            System.out.print("Nhập đơn giá: ");
            double donGia = scanner.nextDouble();

            System.out.print("Nhập diện tích: ");
            double dienTich = scanner.nextDouble();
            scanner.nextLine(); 

            if (loaiGD.equals("dat")) {
                System.out.print("Nhập loại đất (A/B/C): ");
                String loaiDat = scanner.nextLine();
                Giaodichdat gd = new Giaodichdat(maGD, ngayGD, donGia, dienTich, loaiDat);
                danhSachGiaoDich.add(gd);
            } else if (loaiGD.equals("nha")) {
                System.out.print("Nhập loại nhà (cao_cap/thuong): ");
                String loaiNha = scanner.nextLine();

                System.out.print("Nhập địa chỉ: ");
                String diaChi = scanner.nextLine();

                Giaodichnha gd = new Giaodichnha(maGD, ngayGD, donGia, dienTich, loaiNha, diaChi);
                danhSachGiaoDich.add(gd);
            }
        }
    }

    public void xuatDanhSachGiaoDich() {
        System.out.println("Danh sách giao dịch:");
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd instanceof Giaodichdat) {
                System.out.println("Giao dịch đất");
                System.out.println("Mã giao dịch: " + gd.maGD);
                System.out.println("Ngày giao dịch: " + gd.ngayGD);
                System.out.println("Đơn giá: " + gd.donGia);
                System.out.println("Diện tích: " + gd.dienTich);
                System.out.println("Loại đất: " + ((Giaodichdat) gd).loaidat);
                System.out.println("Thành tiền: " + gd.tinhThanhTien());
            } else if (gd instanceof Giaodichnha) {
                System.out.println("Giao dịch nhà");
                System.out.println("Mã giao dịch: " + gd.maGD);
                System.out.println("Ngày giao dịch: " + gd.ngayGD);
                System.out.println("Đơn giá: " + gd.donGia);
                System.out.println("Diện tích: " + gd.dienTich);
                System.out.println("Loại nhà: " + ((Giaodichnha) gd).loaiNha);
                System.out.println("Địa chỉ: " + ((Giaodichnha) gd).diaChi);
                System.out.println("Thành tiền: " + gd.tinhThanhTien());
            }
        }
    }

    public void tinhTongSoLuong() {
        int soLuongDat = 0;
        int soLuongNha = 0;
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd instanceof Giaodichdat) {
                soLuongDat++;
            } else if (gd instanceof Giaodichnha) {
                soLuongNha++;
            }
        }
        System.out.println("Số lượng giao dịch đất: " + soLuongDat);
        System.out.println("Số lượng giao dịch nhà: " + soLuongNha);
    }

    public void tinhTrungBinhThanhTienDat() {
        double tongThanhTienDat = 0;
        int soLuongDatCoGia = 0;
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd instanceof Giaodichdat) {
                tongThanhTienDat += gd.tinhThanhTien();
                soLuongDatCoGia++;
            }
        }
        double trungBinhThanhTienDat = soLuongDatCoGia > 0 ? tongThanhTienDat / soLuongDatCoGia : 0;
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTienDat);
    }

    public void xuatGiaoDichThang9Nam2013() {
        System.out.println("Các giao dịch tháng 9 năm 2013:");
        for (Giaodich gd : danhSachGiaoDich) {
            if (gd.ngayGD.startsWith("09/2013")) {
                if (gd instanceof Giaodichdat) {
                    System.out.println("Giao dịch đất");
                    System.out.println("Mã giao dịch: " + gd.maGD);
                    System.out.println("Ngày giao dịch: " + gd.ngayGD);
                    System.out.println("Đơn giá: " + gd.donGia);
                    System.out.println("Diện tích: " + gd.dienTich);
                    System.out.println("Loại đất: " + ((Giaodichdat) gd).loaidat);
                    System.out.println("Thành tiền: " + gd.tinhThanhTien());
                } else if (gd instanceof Giaodichnha) {
                    System.out.println("Giao dịch nhà");
                    System.out.println("Mã giao dịch: " + gd.maGD);
                    System.out.println("Ngày giao dịch: " + gd.ngayGD);
                    System.out.println("Đơn giá: " + gd.donGia);
                    System.out.println("Diện tích: " + gd.dienTich);
                    System.out.println("Loại nhà: " + ((Giaodichnha) gd).loaiNha);
                    System.out.println("Địa chỉ: " + ((Giaodichnha) gd).diaChi);
                    System.out.println("Thành tiền: " + gd.tinhThanhTien());
                }
            }
        }
    }
}