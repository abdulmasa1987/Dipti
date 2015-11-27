import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naaa {

	public static void main(String[] args) {

		
		WebDriver driver= new FirefoxDriver();
		driver.findElement(By.xpath("sdsd")).click();
		WebDriverWait wait= new WebDriverWait(driver,20);
		
		driver.findElement(By.xpath("asasasa")).click();


	}
	
}
