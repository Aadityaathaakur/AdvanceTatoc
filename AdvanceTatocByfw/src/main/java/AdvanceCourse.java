import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import UtilPackage.LocatorsCall;

public class AdvanceCourse {
	static WebDriver driver=BrowserDetails.driver;
	static LocatorsCall lc= new LocatorsCall(driver);
	public static String AvanceCourseTest() {
		 System.out.println("ad="+lc);
		lc.getWebElementsTag("linkAdvance").click();
				return driver.getTitle();
 }
}
