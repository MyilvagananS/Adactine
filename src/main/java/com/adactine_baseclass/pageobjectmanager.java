package com.adactine_baseclass;
import org.openqa.selenium.WebDriver;
public class pageobjectmanager {
	public static WebDriver driver;
	private Homepage_Adactine hp;
	private SearchHotel_Adactine sh;
	private SelectHotel_Adactine sa;
	private BookAHotel_Adactine bh;
	private Log_Out_Adactine la;
	public pageobjectmanager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Homepage_Adactine getinstancehp() {
		 hp=new Homepage_Adactine(driver);
		return hp;
	}
	public SearchHotel_Adactine getinstancesh() {
		sh=new SearchHotel_Adactine(driver);
		return sh;
	}
	public SelectHotel_Adactine getinstancesa() {
		 sa=new SelectHotel_Adactine(driver);
		return sa;
	}
	public BookAHotel_Adactine getinstancebh() {
		bh=new BookAHotel_Adactine(driver);
		return bh;
	}
	public Log_Out_Adactine getinstancela() {
		la=new Log_Out_Adactine(driver);
		return la;
	}
	
}
