package uptake_pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	
public class PeoplePage {

	public PeoplePage(WebDriver driver){
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
	
	@FindBy(xpath ="//*[@id='features']/div/div[2]/a[1]")
	public WebElement clarityButton;
			
	@FindBy(xpath ="//*[@id='features']/div/div[2]/a[2]")
	public WebElement curiosityButton;
	
	@FindBy(xpath ="//*[@id='features']/div/div[2]/a[3]")
	public WebElement flexibilityButton;
	
	@FindBy(xpath ="//*[@id='features']/div/div[2]/a[4]")
	public WebElement industryButton;
	
	@FindBy(xpath ="//*[@id='features']/div/div[2]/a[5]")
	public WebElement trustButton;
	
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="People";
		return getPageTitle().contains(expectedPageTitle);
	}
			
	
	}