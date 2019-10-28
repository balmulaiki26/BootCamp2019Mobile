import common.MobileAPI;
import org.testng.annotations.Test;

public class Account extends MobileAPI {
        @Test
        public void signIn(){
            clickByXpath("//android.view.View[@text=\"Create account\"]");
        }
}
