import geb.Page


class HomePageO2 extends Page {
    static url = "http://shop.o2.co.uk/home"
    static at = { title == "O2 Shop - Home" }
    static content = {
        businessPhones{ $("a",title:"View best business deals from O2") }

        }
    }



