import geb.Browser
import org.openqa.selenium.By

class CommonActions {

    public static def findElementByXpath(Browser browser, String expression) {
        try {
            browser.getDriver().findElement(By.xpath(expression))
        } catch (Exception e) {
            throw e
        }
    }
}