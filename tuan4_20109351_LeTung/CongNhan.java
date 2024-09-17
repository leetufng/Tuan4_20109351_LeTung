package tuan4_20109351_LeTung;

public class CongNhan {
    String ho, ten;
    int soSanPham;

    public CongNhan(String ho, String ten, int soSanPham) {
        this.ho = ho;
        this.ten = ten;
        this.soSanPham = soSanPham;
    }

    public double tinhLuong() {
        double donGia;
        if (soSanPham <= 199) {
            donGia = 0.5;
        } else if (soSanPham <= 399) {
            donGia = 0.55;
        } else if (soSanPham <= 599) {
            donGia = 0.6;
        } else {
            donGia = 0.65;
        }
        return soSanPham * donGia;
    }

    @Override
    public String toString() {
        return "Cong nhan {" +
                "ho='" + ho + '\'' +
                ", ten='" + ten + '\'' +
                ", so san pham=" + soSanPham +
                ", luong=" + tinhLuong() +
                '}';
    }
}

