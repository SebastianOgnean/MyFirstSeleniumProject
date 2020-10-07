import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.get("https://google.com");
        LogIn firstLogIn = new LogIn();
        //firstLogIn.login1();
        WishListTest firstWishListTest = new WishListTest();
        //firstWishListTest.myWishList1();
        Homepage homepageToSale = new Homepage();
        homepageToSale.homepage1();


    }








}
