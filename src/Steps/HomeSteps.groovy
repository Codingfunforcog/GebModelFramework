import geb.Browser

class HomeSteps{
    def iAmOnHomePage = {
        Browser.drive{
            to HomePage
            assert at(HomePage)

            supportLink.click()
        }
    }
}
