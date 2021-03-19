import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
//import java.util.concurrent.TimeUnit;

public class intellect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://rpintellect.com/");
        driver.manage().window().maximize();
        String title=driver.getTitle();
        System.out.println(title);
        if(title.equals("RPIntellect | Website Designing Coimbatore | Web and Mobile Development in Coimbatore")) {
            List<WebElement>item= driver.findElements(By.xpath("//h3[@class='service-title']"));
            System.out.println(item.size());
            JavascriptExecutor jse=(JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,1050);");
          //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          //  WebDriverWait wait= new WebDriverWait(driver,3);
          //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[text()='Responsive Designs']")));
            Thread.sleep(2000);
            driver.findElement(By.xpath("//p[text()='Responsive Designs']")).click();
            Thread.sleep(2000);
            jse.executeScript("window.scrollBy(0,950);");
          String heading= driver.findElement(By.xpath("(//p[@class='price-box-title'])[2]")).getText();
            System.out.println(heading);
           String amt=driver.findElement(By.xpath("//span[text()='10000']")).getText();
            System.out.println(amt);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[text()='GET STARTED - Rs.10000']")).click();
           // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
          //  jse.executeScript("window.scrollBy(0,7700);");
            Thread.sleep(2000);
            jse.executeScript("window.scrollBy(0,1050);");
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Name");
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
            driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("7024651230");
            driver.findElement(By.xpath("//textarea[@id='comments']")).sendKeys("hi");
          //  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            Thread.sleep(2000);
            String txt = driver.findElement(By.xpath("//div[contains(@class,'success')]")).getText();
            System.out.println(txt);
        }else{
            System.out.println("Wrong WebPage");
        }
        driver.quit();

    }
}
