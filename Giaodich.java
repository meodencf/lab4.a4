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
public abstract class  Giaodich{

    protected String maGD;
    protected String ngayGD;
    protected double donGia;
    protected double dienTich;

    public Giaodich(String maGD, String ngayGD, double donGia, double dienTich) {
        this.maGD = maGD;
        this.ngayGD = ngayGD;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public abstract double tinhThanhTien();
}
    
