import geb.Browser
/**
 * Created with IntelliJ IDEA.
 * User: CTS1
 * Date: 2/8/13
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */
class FormDetailsStep {
    def iSelectBusinessType = {
        Browser.drive {
            assert at(FormDetailPage)
            businessType.click()
        }
    }
}
