package smartTech.basePage;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;
    Properties prop;

    public WebDriver getDriver() {
        return driver;
    }

    @Test
    public void initilization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("asdsad");
//    return driver;
    }

    public Properties getProperty() throws IOException {
        File file = new File("C:\\Users\\gamin\\IdeaProjects\\Pratice\\src\\main\\java\\smartTech\\utils\\config.property");
        FileInputStream fin = new FileInputStream(file);
        prop = new Properties();
        prop.load(fin);
        return prop;

    }


}
