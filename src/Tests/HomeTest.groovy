import org.junit.Test

@Mixin([HomeSteps])
class HomeTest{

    @Test
    void verifyWeAreOnHomePage(){
         iAmOnHomePage()
    }

}