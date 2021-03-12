import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class swag {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userName=driver.findElement(By.xpath("//input[@name='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        String expected_title="Swag Labs";
        String actual_title= driver.getTitle();
        System.out.println(actual_title);
        if (expected_title.equals(actual_title)) {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }
        List<WebElement> item=driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        int item1= item.size();
        System.out.println("Total No Of Products:"+" "+ item1);
        WebElement desc=driver.findElement(By.xpath("//div[@class='inventory_item_desc' and contains(text(),'carry')]"));
        String description=desc.getText();
        System.out.println("Product Description"+" "+description);
        if (driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).isDisplayed()) {
            WebElement btn1 = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
            btn1.click();
            System.out.println("Expected Product Present");
            WebElement cart= driver.findElement(By.xpath("//div[contains(@id,'shopping_cart')]"));
            cart.click();
        }
        else {
            System.out.println("Expected Product not present");
        }
        String text=driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        System.out.println(text);
        String amt=driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        String cart=driver.findElement(By.xpath("//div[@class='cart_quantity']")).getText();

        if (text.equals("Sauce Labs Backpack") && amt.equals("29.99") && cart.equals("1"))
        {
            driver.findElement(By.xpath("//a[text()='CHECKOUT']")).click();
            System.out.println("Selected item Matches");
        }
        else {
            driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
            System.out.println("Selected item did not Match");

        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter full name");
        String name=sc.nextLine();
        int half=name.length()/2;
        String part1=name.substring(0,half);
        String part2=name.substring(half);
        System.out.println(part1);
        System.out.println(part2);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys(part1);
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys(part2);
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("641028");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        if(driver.findElement(By.xpath("//div[contains(text(),'Payment Information')]")).isDisplayed()){
            String payment=driver.findElement(By.xpath("(//div[@class='summary_value_label'])[1]")).getText();
            System.out.println(payment);
        }
        else{
            System.out.println("Error");
        }
        if(driver.findElement(By.xpath("//div[contains(text(),'Shipping Information')]")).isDisplayed()) {
            String shipping = driver.findElement(By.xpath("(//div[@class='summary_value_label'])[2]")).getText();
            System.out.println(shipping);
        }
        else{
            System.out.println("Error");
        }
        String itemTotal= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText();
        System.out.println(itemTotal);
        String tax=driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText();
        System.out.println(tax);
        String total=driver.findElement(By.xpath("//div[@class='summary_total_label']")).getText();
        System.out.println(total);
        driver.findElement(By.xpath("//a[text()='FINISH']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        WebElement element=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@alt='Pony Express']")));
        if (driver.findElement(By.xpath("//img[@alt='Pony Express']")).isDisplayed())
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        String header=driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
        System.out.println(header);
        String text1=driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
        System.out.println(text1);
        String subHeader1=driver.findElement(By.xpath("//div[@class='subheader']")).getText();
        System.out.println(subHeader1);
        driver.quit();
    }

}
