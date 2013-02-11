        import CommonActions
        import geb.spock.GebReportingSpec
        import geb.Browser
        import org.junit.Test

     @Mixin([HomeSteps])
      class BusinessPhones extends GebReportingSpec {



       def "go to O2 site"() {

                when:
                go()

                and:
                assert title == "O2 Shop - Home"

                then:
                 HomeSteps

                then:
                println("I am there")
       }

        }

             /*
               $("a",title:"View best business deals from O2").click()
                and:


               withWindow({ $('title').text() == 'O2 | Business Shop | The home of our best business deals for between 1 and 10 users' }){
                    def CommonActionsObj = new CommonActions()
                    CommonActionsObj.findElementByXpath(getBrowser(), "//div[h2[text()='Free Samsung S III Mini']]/a[span[text()='Buy now']]").click()

                }

           and:


           then:
           println("I am there")


       }
}*/
