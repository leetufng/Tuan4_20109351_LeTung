package tuan4_20109351_LeTung;

public class List {
	    public static void main(String[] args) {
	        DanhSachCongNhan danhSach = new DanhSachCongNhan(5);
	        danhSach.them(new CongNhan("Nguyen", "Van A", 150));
	        danhSach.them(new CongNhan("Le", "Van B", 130));
	        danhSach.them(new CongNhan("Do", "Van T", 120));
	        danhSach.them(new CongNhan("Phan", "Van A", 100));
	        danhSach.them(new CongNhan("Tran", "Van A", 200));
	        System.out.println(danhSach);
	        
	    }
	}


