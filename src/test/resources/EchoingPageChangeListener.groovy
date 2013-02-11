import geb.PageChangeListener
import geb.Browser
import geb.Page

class EchoingPageChangeListener implements PageChangeListener {
    void pageWillChange(Browser browser, Page BuyPhonesPage, Page CheckOutPage) {
//        println "browser '$browser' changing page from '$oldPage' to '$newPage'"
    }
}