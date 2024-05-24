package Class;


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
	
}
