package com.adactine_baseclass;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Base_Class {
	//**************** 1. BrowserLaunch ******************
	public static WebDriver driver;
	public static WebDriver browser_launch(String text)
	{
	if(text.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\CucuDriver\\chromedriver.exe");
		driver=new ChromeDriver();	
	}
	else if(text.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		driver=new FirefoxDriver();	
	}
	else if(text.equalsIgnoreCase("IE")) {
		System.setProperty("webdriver.ie.driver",
				System.getProperty("user.dir")+"\\driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	driver.manage().window().maximize();
	return driver;
	}
	// ************************* 2.get ********************
	public static void get(String url) {
		driver.get(url);
	}
	//************************** 3.close******************
	public static WebDriver close() {
		driver.close();
		return driver;
	}
	//************************** 4.Quit******************
	public static void quit() {
		driver.quit();
	}
	//************************** 5-8.Navigation methods to,forward,back,refresh*************
	public static void to(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	//******************************** 9.ALERT *************************
	public static void alert(String text,String value) {
		if(text.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
	}
		else if(text.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
	}
		else if(text.equalsIgnoreCase("promt")) {
		driver.switchTo().alert().sendKeys(value);
		if(text.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();}
		else {
		driver.switchTo().alert().dismiss();
		}
	}
	}
	//****************** 10. Actions***************************
	public static void action(WebDriver driver ,WebElement element,WebElement target,String text) {
		Actions ac=new Actions(driver);
		if(text.equalsIgnoreCase("click")) {
		ac.click(element).build().perform();}
		else if(text.equalsIgnoreCase("doubleclick")) {
		ac.doubleClick(element).build().perform();}
		else if(text.equalsIgnoreCase("contextclick")){
		ac.contextClick(element).build().perform();}
		else if (text.equalsIgnoreCase("draganddrop")) {
		ac.clickAndHold(element).moveToElement(target).release(target).build().perform();}
		else if(text.equalsIgnoreCase("mousemove")) {
		ac.moveToElement(element).build().perform();}
	}
	//************************ 11.Frames*********************
	public static void frame(String text,WebElement element,int index) {
		if(text.equalsIgnoreCase("index")) {
		driver.switchTo().frame(index);
	}else if(text.equalsIgnoreCase("locator")) {
		driver.switchTo().frame(element);
	}
	else if(text.equalsIgnoreCase("parent")) {
		driver.switchTo().parentFrame();
	}
	else if(text.equalsIgnoreCase("default")) {
		driver.switchTo().defaultContent();
	}
	}
	//***************************12.Windowhandle*****************
	public static void windowhandle(String text,String element) {
		if(text.equalsIgnoreCase("window")) {
		String windowHandle = driver.getWindowHandle();
			System.out.println(windowHandle);
			String title=driver.switchTo().window(windowHandle).getTitle();
			System.out.println(title);
		}
		if(text.equalsIgnoreCase("windows")) {
			Set<String> windowHandles = driver.getWindowHandles();
			System.out.println(windowHandles);
			for (String id : windowHandles) {
				System.out.println(id);
				String title=driver.switchTo().window(id).getTitle();
				System.out.println(title);
			}
		}
	}
	
	//************************* 13.Dropdown,get options,getalloptions,is multiple,gettext******************
	public static void dropdown(WebElement element,String text,String value) {
		Select se=new Select(element);
		if(text.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
		se.selectByIndex(index);}
		else if(text.equalsIgnoreCase("value")) {
			se.selectByValue(value);
		}
		else if(text.equalsIgnoreCase("tex")) {
			se.selectByVisibleText(value);
		}
		else if(text.equalsIgnoreCase("dindex")) {
			int index = Integer.parseInt(value);
			se.selectByIndex(index);
		}
		else if(text.equalsIgnoreCase("dvalue")) {
			se.selectByValue(value);
		}
		else if(text.equalsIgnoreCase("dtext")) {
			se.selectByVisibleText(value);
		}
		else if (text.equalsIgnoreCase("getoptions")) {
			List<WebElement> options = se.getOptions();
			for (WebElement web : options) {
				System.out.println("options in dropdown ");
				System.out.println(web.getText());
		}
		}
			else if(text.equalsIgnoreCase("getalloptions")) {
			List<WebElement> alloptions = se.getAllSelectedOptions();
			for (WebElement options : alloptions) {
			System.out.println("All options in dropdown");
			System.out.println(options.getText());
		}		
		}
			else if(text.equalsIgnoreCase("deselectall")) {
				se.deselectAll();
			}
			else if(text.equalsIgnoreCase("multiple")) {
				boolean multiple = se.isMultiple();
				System.out.println(multiple);
			}
			else if(text.equalsIgnoreCase("gettext")) {
			System.out.println(element.getText());
			}
		}
		// ******************************** 18. get title*************
		public static void gettitle() {
		System.out.println(driver.getTitle());
		}	
		//************************************ 19.get current url***************
		public static void geturl() {
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		//************************************ 20.SendKeys***************
		public static void input(WebElement element,String value) {
			element.sendKeys(value);
		}
		//******************************* 21.click********************
		public static void click(WebElement element) {
			element.click();
		}
		//*******************************22.TakesScreenshot******************
		public static void Takesscreen(String path) throws Throwable {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(path);
			FileUtils.copyFile(source, dest);
		}
		//****************************** 23.check box*******************
		public static void checkbox(WebElement element) {
			element.click();
		}
		//******************************* 24.Radiobutton*****************
		public static void radiobutton(WebElement element) {
			element.click();
		}
		//************************************25.is enable****************
		public static void enable(WebElement element) {
			System.out.println(element.isEnabled());
		}
		//************************************26.is displayed****************
		public static void display(WebElement element) {
			System.out.println(element.isDisplayed());
		}
		//********************************* 27.is selected********************
		public static void select(WebElement element) {
			System.out.println(element.isSelected());
		}
		//********************************** 28.Robot**********************
		public static void bot(String text) throws AWTException {
			Robot r=new Robot();
			if(text.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			}else if(text.equalsIgnoreCase("backspace")) {
				r.keyPress(KeyEvent.VK_BACK_SPACE);
				r.keyRelease(KeyEvent.VK_BACK_SPACE);
			}
		}
		//*******************************29.get attribute******************
		public static void getattribute(WebElement element,String value) {
			String attribute = element.getAttribute(value);
			System.out.println("value of attriute is:"+attribute);
		}
		//*************************** 30.get text*************************
		public static void gettext(WebElement element) {
			String text = element.getText();
			System.out.println(text);
		}
		//******************************* 31.Scroll up and down*****************
		public static void Scroll(int initial,int range) {
			JavascriptExecutor je=(JavascriptExecutor)driver;
			je.executeScript("window.Scrollby(initial ,range);");
		}
		//*******************************32.wait*******************************
		public static WebDriver waite(String text,WebElement element,int timeout,String value){
			if(text.equalsIgnoreCase("iwait")) {
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
			else if(text.equalsIgnoreCase("sewait")) { //se-sendkeys explicit wait
				WebDriverWait wdw=new WebDriverWait(driver,timeout);
				wdw.until(ExpectedConditions.visibilityOf(element));
				element.sendKeys(value);
			}
			else if(text.equalsIgnoreCase("cewait")) {
				WebDriverWait wdw=new WebDriverWait(driver,timeout);
				wdw.until(ExpectedConditions.visibilityOf(element));
				element.click();
			}
			return driver;
		}
		public static String value;
		public static String read_data(String path,int index,int row,int cellnum) throws IOException {
			File f=new File(path);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sheetAt = wb.getSheetAt(index);
			Row row2 = sheetAt.getRow(row);
			Cell cell = row2.getCell(cellnum);
			CellType cellType = cell.getCellType();
			if(cellType.equals(cellType.STRING)) {
				value = cell.getStringCellValue();
				System.out.println(value);
			}
			else if(cellType.equals(cellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int data =(int) numericCellValue;
				value = String.valueOf(data);
				System.out.println(value);
			}
			return value;
		}	
		}