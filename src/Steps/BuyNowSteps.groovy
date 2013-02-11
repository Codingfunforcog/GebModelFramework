import geb.Browser
import org.openqa.selenium.WebDriver

class BuyNowSteps {
    def iClickOnBuyNowForSamsungMini = {
        Browser.drive {
            withWindow({ $('title').text() == 'O2 | Business Shop | The home of our best business deals for between 1 and 10 users' }) {
                assert at(BuyPhonesPage)
                buyNowButtonForSamsungMini.click()
            }
        }
    }
}
