import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class TestFile {


    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }

}
