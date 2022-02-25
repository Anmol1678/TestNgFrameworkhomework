import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.scene.layout.Priority;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGFramework {

    WebDriver driver;

    @Test(priority = 1)
    void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void selectcomputer() {
        System.out.println("user able to select computer");

        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a")).click();
    }

    @Test(priority = 3)
    void SelectDesktop() {
        System.out.println("User able to select desktop");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
    }

    @Test(priority = 4)
    void SelectLenovo() {
        System.out.println("user able to select lenovo");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
    }

    @Test(priority = 5)
    void clickOnAddToCart() {

        System.out.println("user able to click  add to cart");
        driver.findElement(By.id("add-to-cart-button-3")).click();

    }

    @Test(priority = 6)
    void ShoppingCart() {
        System.out.println("click on shopping cart");
        driver.findElement(By.className("ico-cart")).click();
    }

    @Test(priority = 7)
    void addquanity() {

        System.out.println("addequanity");
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
    }

    @Test(priority = 8)
    void updatequanity() {

        System.out.println("updatequanity");
        driver.findElement(By.id("updatecart")).click();

    }

    @Test(priority = 9)
    void ClickonCheckout() {

        System.out.println("click on checkbox");
        driver.findElement(By.id("termsofservice")).click();

    }

    @Test(priority = 10)
    void Clickonheckout() {

        System.out.println("checkout");
        driver.findElement(By.id("checkout")).click();

    }

   @Test(priority = 11)
   void checkout() {
        System.out.println("checkoutasquest");

        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();


    }
}










































