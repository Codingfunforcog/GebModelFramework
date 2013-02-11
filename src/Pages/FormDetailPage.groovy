import geb.Page

class FormDetailPage extends Page {
    static at = {title == "O2 | Business Shop | The home of our best business deals for between 1 and 10 users"}
    static content = {

        businessType {$(form)."j_id0:j_id1:o2Template:j_id133" = "Limited Company"}

    }
}
