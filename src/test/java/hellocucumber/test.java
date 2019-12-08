package hellocucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

public class test {
	WebDriver driver;
	WebElement webElement;

	@Given("I am on ruby watir page")
	public void i_am_on_ruby_watir_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\paivi\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://test.rubywatir.com/radios.php");
		driver.manage().window().maximize();
	}

	@Given("I click on {string}")
	public void i_click_on(String string) throws InterruptedException {
		if (string.contains("Radio1")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[1]"));
			webElement.click();
		} else if (string.contains("Radio with class")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[2]"));
			webElement.click();
		} else if (string.contains("Radio with id")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[3]"));
			webElement.click();
		} else if (string.contains("Radio with name")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[4]"));
			webElement.click();
		} else if (string.contains("Radio5")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[5]"));
			webElement.click();
		} else if (string.contains("Radio6")) {
			webElement = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[2]/p/input[6]"));
			webElement.click();
		}	
	}
	
	@Given("I close the browser")
	public void i_close_the_browser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
