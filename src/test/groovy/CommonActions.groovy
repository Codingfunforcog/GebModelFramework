import geb.Browser
import geb.spock.GebReportingSpec
import org.openqa.selenium.By

class CommonActions extends GebReportingSpec{

    public static def findElementByXpath(Browser objBrwser, String expression) {
    try {
        objBrwser.getDriver().findElement(By.xpath(expression))
    } catch (Exception e) {
        throw e
    }
}
}