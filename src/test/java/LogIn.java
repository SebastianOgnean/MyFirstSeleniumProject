import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {
    public static void login1(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("cosmin@fasttrackit.org");
        driver.findElement(By.cssSelector("#pass")).sendKeys("12435");
        driver.findElement(By.cssSelector("#send2")).click();
        driver.quit();
    }
}
