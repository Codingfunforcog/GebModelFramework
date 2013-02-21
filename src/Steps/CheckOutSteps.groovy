import geb.Browser
import org.openqa.selenium.By

class CheckOutSteps {
    def iClickOnCheckOut = {
        Browser.drive {
            withWindow({$("div", class: "overviewButtons").click()}) {
            getDriver().findElement(By.xpath("//span[.='Checkout']")).click()
            }
        }
    }
}

            /*withWindow({$("div", class: "overviewButtons").click()}) {
//            to(CheckOutPage)
                assert at(CheckOutPage)
                checkOut.click()
            }*/
/*
        }*//*



*/
