import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class barclays {

    public static void main(String[] args) {

        String baseUrl = "https://www.barclays.co.uk/";
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String title = driver.getTitle();
        boolean verifyTitle = title.equals("Personal banking | Barclays");
        boolean verifyContains = title.contains("Register");
        System.out.println(verifyContains);
        System.out.println(verifyTitle);
        System.out.println(title.length());
        System.out.println(title);

        String pageSource = driver.getPageSource();
        System.out.println(pageSource);

        driver.close();

    }


}
