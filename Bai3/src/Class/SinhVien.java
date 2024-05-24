package Class;

import java.util.Scanner;
public class SinhVien extends Nguoi {
private String msv;
public SinhVien() {
}
	public SinhVien(String hoTen, String msv) {
		this.hoTen=hoTen;
		this.msv=msv;
	}
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.println("Nhap MSV: ");
		msv=sc.nextLine();
	}
	public void inThongTin() {
		super.inThongTin();
		System.out.println("MSV: "+msv);
		System.out.println("---------------------------");
	}
	public String getMsv() {
		return msv;
	}
}