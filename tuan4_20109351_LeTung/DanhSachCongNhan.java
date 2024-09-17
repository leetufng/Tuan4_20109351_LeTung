package tuan4_20109351_LeTung;

public class DanhSachCongNhan {
	    private CongNhan[] ds;
	    private int n;

	    public DanhSachCongNhan(int n) {
	        this.ds = new CongNhan[n];
	        this.n = 0;
	    }

		public void them(CongNhan cn) {
	        if (n < ds.length) {
	            ds[n++] = cn;
	        } else {
	            System.out.println("Danh sach da day!");
	        }
	    }

	    public int soLuong() {
	        return n;
	    }

	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < n; i++) {
	            sb.append(ds[i]).append("\n");
	        }
	        return sb.toString();
	    }

	    public void xoa(String ma) {
	       
	    }

	    public DanhSachCongNhan layDanhSachTren200SanPham() {
			return null;
	    
	    }

	    public void sapXep() {
	       
	    }
	}

