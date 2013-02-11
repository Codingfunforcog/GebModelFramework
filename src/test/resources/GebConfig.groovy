/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.chrome.ChromeDriver

reportsDir = "target/geb-reports"
baseUrl = "http://shop.o2.co.uk/home"
def userDirectory = System.getProperty("user.dir")
System.setProperty("webdriver.chrome.driver", userDirectory + "\\src\\test\\resources\\chromedriver.exe");
driver = { new ChromeDriver() }

environments {

    chrome {
        driver = { new ChromeDriver() }
    }

}