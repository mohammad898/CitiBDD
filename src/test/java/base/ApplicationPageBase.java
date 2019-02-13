

    package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


    public class ApplicationPageBase {

        String pageUrl;

        public static WebDriver driver = null;

        //return status of link if it is enabled
        public static boolean isEnableStatus(WebDriver driver, WebElement web) {
            boolean en = web.isEnabled();
            return en;
        }

        public static void sendKeys(WebElement webElement, String webElementName, String keys) {
            webElement.clear();

            webElement.sendKeys(keys);
            //  TestLogger.log("Keys Sent to " + webElementName);
        }

        public static String getText(WebElement webElement, String webElementName) {

            // TestLogger.log("Getting Text from " + webElementName);
            String actualText = webElement.getText();


            return actualText;

        }

        public static void click(WebElement webElement, String webElementName) {

            webElement.click();
            //TestLogger.log("Clicked " + webElementName);
        }

        public static void search(WebElement webElement, String webElementName) {

            webElement.click();
            //TestLogger.log("Clicked " + webElementName);
        }
    }

