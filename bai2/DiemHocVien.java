
package bai3;
import java.util.Collection;
   import java.util.List;



 

public class DiemHocVien {
    private String hoTen;
    private int namSinh;
    private List<Double> diemMonHoc;

    public DiemHocVien(String hoTen, int namSinh, List<Double> diemMonHoc) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.diemMonHoc = diemMonHoc;
    }

    public boolean coLamLuanVan() {
        return diemTrungBinh() > 7 && diemMonHoc.stream().allMatch(diem -> diem >= 5);
    }

    public boolean coThiTotNghiep() {
        return diemTrungBinh() <= 7 && diemMonHoc.stream().allMatch(diem -> diem >= 5);
    }

    public boolean coThiLai() {
        return diemMonHoc.stream().anyMatch(diem -> diem < 5);
    }

    public double diemTrungBinh() {
        double tongDiem = 0;
        for (double diem : diemMonHoc) {
            tongDiem += diem;
        }
        return tongDiem / diemMonHoc.size();
    }

    Collection<? extends String> monThiLai() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

    
