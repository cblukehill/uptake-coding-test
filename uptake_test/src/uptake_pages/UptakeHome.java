
package uptake_pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class UptakeHome {

	public UptakeHome(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//*[@id='menu-item-4164']/a")
	public WebElement ourApproach;
	
	@FindBy(xpath = "//*[@id='menu-item-4163']/a")
	public WebElement ourPlatform;
	
	@FindBy(xpath = "//*[@id='menu-item-4172']/a")
	public WebElement ourSolutions;
	
	@FindBy(xpath = "//*[@id='menu-item-4162']/a")
	public WebElement ourPeople;
	
	@FindBy(xpath = "//*[@id='menu-item-4167']/a")
	public WebElement ourJoinUs;
	
	@FindBy(xpath = "//*[@id='menu-item-4166']/a")
	public WebElement ourBlog;
	
	@FindBy(xpath = "//*[@id='top']/div/a/svg")
	public WebElement uptakeMain;
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Home";
		return getPageTitle().contains(expectedPageTitle);
	}
	
	
	
}
	
