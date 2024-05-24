package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class QLHS {
	private ArrayList<HocSinh> dshs;
	
	public QLHS() {
		dshs=new ArrayList<HocSinh>(100);
	}
	
	public void themHocSinh(HocSinh hs) {
		dshs.add(hs);
	}
	
	public void nhapDanhSachHS(Scanner sc) {
		HocSinh hs;
		System.out.println("Nhap vao so luong hoc sinh can nhap them: ");
		int n=sc.nextInt();sc.nextLine();
		System.out.println("Nhap thong tin cho hoc sinh trong danh sach");
		for(int i=0;i<n;i++) {
			System.out.println("Nhap thong tin hoc sinh "+(i+1));
			hs=new HocSinh();
			hs.nhapThongTin(sc);
			themHocSinh(hs);
		}
	}
	public void inDanhSach() {
		int n=dshs.size();
		for(int i=0;i<n;i++) {
			System.out.println("Hoc sinh "+(i+1));
			dshs.get(i).inThongTin();
		}
	}
	public void timKiemHocSinh(int namSinh,String queQuan) {
		System.out.println("Hoc sinh sinh nam "+namSinh+" va que o "+queQuan+" la: ");
		for(HocSinh hs : dshs) {
			if((hs.ngaySinh.getYear()+1900==namSinh)&&(hs.queQuan.equals(queQuan))) {
				hs.inThongTin();
			}
		}
	}
	public void timKiemHocSinh(String lop) {
		System.out.println("Hoc sinh o lop "+lop+" la: ");
		for(HocSinh hs : dshs) {
			if(lop.equals(hs.getLop())) {
				hs.inThongTin();
			}
		}
	}
	
}