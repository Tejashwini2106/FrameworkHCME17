package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class ThirdTest extends BaseClass{
 @Test
 public void thirdTest() throws InterruptedException {
	 SoftAssert soft =new SoftAssert();
	 home.searchFor("core java foe selenium");
	 soft.assertEquals(coreJava.getPageHeader(), "CORE JAVA FOR SELEINUM");
	 
	 coreJava.clickcoreJavaForSeleniumLink();
	 soft.assertEquals(javaVideo.getPageHeader(), "Core Java For Selenium Training");
	 javaVideo.clickCloseCookies();
	 web.switchToFrame();
	 javaVideo.clickPlayButton();
	 Thread.sleep(2000);
	 javaVideo.clickpuseButton();
	 web.switchBackFromFrame();
	 
	 javaVideo.clickAddToWishlistTab();
	 soft.assertAll();
 }
 
}
