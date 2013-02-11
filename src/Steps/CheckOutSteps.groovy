import geb.Browser

class CheckOutSteps {
    def iClickOnCheckOut = {
        Browser.drive{
            withWindow({$("div", class:"overviewButtons").click()}){
//            to(CheckOutPage)
            assert at(CheckOutPage)
            checkOut.click()
            }
        }
    }
}
