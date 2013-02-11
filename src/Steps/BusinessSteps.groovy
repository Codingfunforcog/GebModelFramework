import geb.Browser

class BusinessSteps {
    def iamOnHomePage = {
        Browser.drive {
            to HomePageO2
            assert at(HomePageO2)
        }

    }
    def iClickOnTheBusinessPhone = {
        Browser.drive {
            assert at(HomePageO2)
            businessPhones.click()


        }


    }
}
