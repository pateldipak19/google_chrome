import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerce {
    public static void main(String[] args) {

        String url = "https://demo.nopcommerce.com/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
        driver.get(url);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("nopcommerce demo store");
        boolean verifyTitleContains = title.contains("login");
        System.out.println(verifyTitle);
        System.out.println(verifyTitleContains);
        System.out.println(title);
        System.out.println(title.length());

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();

    }
}
