import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class wCHT {

    public static void main(String[] args) {

        String baseUrl = "https://www.wcht.org.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Watford Community Housing homepage | Watford Community Housing");
        Boolean verifyContains = title.contains("Your home");
        System.out.println(title);
        System.out.println(title.length());
        System.out.println(verifyContains);
        System.out.println(verifyTitle);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();
    }
}
