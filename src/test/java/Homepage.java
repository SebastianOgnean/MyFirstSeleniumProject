import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
    public static void homepage1() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testfasttrackit.info/selenium-test/");
        driver.findElement(By.cssSelector("#header > div > a > img.large")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a")).click();
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > ul > li.level1.view-all > a")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > ul > li:nth-child(1) > a")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();



    }

}