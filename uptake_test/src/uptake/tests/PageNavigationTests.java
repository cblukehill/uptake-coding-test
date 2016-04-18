package uptake.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uptake_pages.PeoplePage;
import uptake_pages.UptakeHome;


public class PageNavigationTests {

	public static WebDriver driver = new ChromeDriver();
	public void verifyHomepage(){
		
		driver.navigate().to("http://uptake.com");
		UptakeHome page = new UptakeHome(driver);
		
		page.ourPeople.click();
	}
		public void verifyPeoplePage() {
			Assert.assertTrue(PeoplePage.verifyPeoplePageTitle(), "This is not the people page!");

		}
		
		public void clickHome(){
			page.uptakeMain.click();
		}
		
		
		public void verifyNavigation() {
			UptakeHome = new UptakeHome(driver);
			Assert.assertTrue(UptakeHome.verifyUptakeHomeTitle(), "This is not the home page!");

		}

		
	
}

