/*
	This is the Geb configuration file.
	
	See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.chrome.ChromeDriver

reportsDir = "target/geb-reports"
baseUrl = "https://www.o2.co.uk/shop"
System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\chromedriver.exe");
driver = { new ChromeDriver() }

environments {

	chrome {
		driver = { new ChromeDriver() }
	}

}