import geb.Page

class BuyPhonesPage extends Page {
    static at = {title == "O2 | Business Shop | The home of our best business deals for between 1 and 10 users"}
    static content = {
        buyNowButtonForSamsungMini { $("div", class: "siteProd2 busContent ").find("a span")}
    }
}
