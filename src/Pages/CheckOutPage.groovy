import geb.Page

class CheckOutPage extends Page {
    static at = {title == "O2 | Business Shop | The home of our best business deals for between 1 and 10 users"}

    static content = {
        checkOut {$("div", class: "overviewButtons").find("a")}
    }
}


