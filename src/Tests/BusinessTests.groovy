import org.junit.Test


@Mixin([BusinessSteps, BuyNowSteps, CheckOutSteps, FormDetailsStep])
class BusinessTests {

    @Test
    void verifyWeAreOnHomePageO2() {
        iAmOnHomePage()
        iClickOnTheBusinessPhone()
        iClickOnBuyNowForSamsungMini()
        iClickOnCheckOut()
        iSelectBusinessType()
    }
}
