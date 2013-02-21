import geb.Page
import geb.Browser

class FormDetailPage extends Page {
    static at = {title == "O2 | Business Shop | The home of our best business deals for between 1 and 10 users"}
   static content = {

       companyName(wait:true){$("input",name:"j_id0:j_id1:o2Template:j_id133:j_id158")}
       registrationNumber(wait:true){$("input",name:"j_id0:j_id1:o2Template:j_id133:j_id165")}
       businessPhoneNumber(wait:true){$("input",name:"j_id0:j_id1:o2Template:j_id133:j_id172")}
       numberOfEmployees(wait:true){$("input",name:"j_id0:j_id1:o2Template:j_id133:j_id179")}

    }
}
