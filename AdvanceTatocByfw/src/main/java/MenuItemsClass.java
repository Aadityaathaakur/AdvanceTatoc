import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import UtilPackage.LocatorsCall;

public class MenuItemsClass {
	static WebDriver driver=BrowserDetails.driver;
	static LocatorsCall lc= new LocatorsCall(driver);
	 public static String test_menu_items() {
		 
		  lc.getWebElementsTag("menuItems").click();
		  lc.getWebElementsTag("insidemenu").click();
		  
				return driver.getTitle();
	 }
}
