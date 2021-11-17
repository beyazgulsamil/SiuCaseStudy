package utils.driver;

import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Driver {
    public static RemoteWebDriver driver;

    public void initDriver() {
        Properties properties = new Properties();
        try {
            properties.load(new FileReader("src/test/resources/test.properties"));
            driver = DriverFactory.driverInit(properties.getProperty("browser"));
            assert driver != null;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void teardown(){
        driver.quit();
    }
}
