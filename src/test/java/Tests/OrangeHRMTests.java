package Tests;
import com.orangehrm.Pages.OrangeHRMHomePage;
import com.orangehrm.Pages.OrangeHRMLoginPage;
import org.testng.annotations.Test;
public class OrangeHRMTests extends BaseTest {
    private OrangeHRMTests(){}
        @Test
        public void loginLogoutTest() throws InterruptedException {
        OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
        OrangeHRMHomePage ohhp = ohlp.enterUserName("Admin").enterPassWord("admin123").clickLogin();
        ohhp.clickWelcome().clickLogout();

    }

}