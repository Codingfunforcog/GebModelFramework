import geb.Page

class CheckOutPage extends Page {
    static at = {title == "O2 | Business Shop | The home of our best business deals for between 1 and 10 users"}
    //   static at = {true}
    static content = {
        checkOut {$("div", class: "overviewButtons").find("a span")}
//         checkOut {$("div")}
//         checkOut {$("a",title:"View best business deals from O2")}
    }
}


