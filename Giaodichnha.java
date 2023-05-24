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
public class GiaoDichNha extends GiaoDich {
    protected String loaiNha;
    protected String diaChi;

    public GiaoDichNha(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiNha, String diaChi, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public double tinhThanhTien() {
        if (loaiNha.equals("cao cap")) {
            return dienTich * donGia;
        } else {
            return dienTich * donGia * 0.9;
        }
    }
}
