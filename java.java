package bai3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	protected String hoTen;
	protected Date ngaySinh;
	protected String queQuan;
	
	public Nguoi() {
		
	}
	
	public Nguoi(String hoTen,Date ngaySinh) {
		 this.hoTen=hoTen;
		 this.ngaySinh=ngaySinh;
	}
	
	public Nguoi(String hoTen,Date ngaySinh,String queQuan) {
			this(hoTen,ngaySinh);
			this.queQuan=queQuan;
	}
	
	public void nhapThongTin(Scanner sc) {
		System.out.println("Nhap ho ten: ");
		hoTen=sc.nextLine();
		System.out.println("Nhap ngay sinh: ");
		String strDate=sc.nextLine();
		ngaySinh=strToDate(strDate);
		System.out.println("Nhap que quan: ");
		queQuan=sc.nextLine();
	}
	
	private Date strToDate(String strDate) {
		Date Date=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		try {
			Date=sdf.parse(strDate);
		} catch (ParseException e) {
			
		}
		return Date;
	}

	public void inThongTin() {
		System.out.println("Ho ten: "+hoTen);
		System.out.println("Ngay sinh: "+ngaySinh);
		System.out.println("Que Quan: "+queQuan);
	}
	public static void main(String[] args) {
		HocSinh hs=new HocSinh();
		Scanner sc = new Scanner(System.in);
		hs.nhapThongTin(sc);
		hs.inThongTin();
		
		
	}
}








package bai3;

import java.util.Date;
import java.util.Scanner;

public class HocSinh extends Nguoi {
	private String lop;
	private String khoaHoc;
	private int kyHoc;
	
	public HocSinh() {
		
	}
	
	public HocSinh(String hoTen, Date ngaySinh, String lop, String khoaHoc){
		super(hoTen, ngaySinh);
		this.lop=lop;
		this.khoaHoc=khoaHoc;
	}

	public HocSinh(String hoTen, String lop, String khoaHoc){
		
		
	}
	public void nhapThongTin(Scanner sc){
		super.nhapThongTin(sc);
		System.out.println("Nhap lop: ");
		lop=sc.nextLine();
		System.out.println("Nhap khoa hoc: ");
		khoaHoc=sc.nextLine();
		System.out.println("Nhap ky hoc: ");
		kyHoc=sc.nextInt();
	}
	public void inThongTin(){
	super.inThongTin();
	System.out.println("Lop: "+lop);
	System.out.println("Khoa hoc: "+khoaHoc);
	System.out.println("Ky hoc: "+kyHoc);
	
		
	}
	
}
	
	
