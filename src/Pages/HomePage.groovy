import geb.Page
/**
 * Created with IntelliJ IDEA.
 * User: cts1
 * Date: 2/6/13
 * Time: 2:38 PM
 * To change this template use File | Settings | File Templates.
 */
class HomePage extends Page {
    static url = "http://shop.o2.co.uk/home"
    static at = { title == "O2 Shop - Home" }

    static content = {

        supportLink { $("a", title: "Get Support from O2") }

    }
}
