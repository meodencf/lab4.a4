
package cau1;

public class GiaoDichDat extends GiaoDich {
    protected String loaiDat;

    public GiaoDichDat(String maGiaoDich, String ngayGiaoDich, double donGia, String loaiDat, double dienTich) {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        this.loaiDat = loaiDat;
    }

    public double tinhThanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia * 1.5;
        } else {
            return dienTich * donGia;
        }
    }
}
