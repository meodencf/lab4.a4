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
public class GiaoDich {
    protected String maGiaoDich;
    protected String ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, double donGia, double dienTich) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }
}
