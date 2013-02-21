import geb.Browser
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.Select
import org.openqa.selenium.WebElement


class FormDetailsStep {
    def iSelectBusinessType = {
        Browser.drive {
            withWindow({$("h1", text: "Checkout").click()}) {
                assert at(FormDetailPage)
                driver.findElement(By.xpath("//*[@id='j_id0:j_id1:o2Template:j_id133:businessType']/option[2]")).click()
                waitFor { companyName.present }
                companyName.value("abcCompany")
                registrationNumber.value("122")
                businessPhoneNumber.value("07899879789")
                numberOfEmployees.value("10")

            }
        }
    }

}