package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class SecondTest extends BaseClass{
@Test
public void secondTest()
{
	SoftAssert soft = new SoftAssert();
	
	home.clickGrears();
	home.clickSkillrarydemoApp();
	web.handleChildBroeser();
	soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
	
	skillraryDemo.selectCategory(web, 1);
	web.handleChildBroeser();
	soft.assertEquals(testing.getPageHeader(), "Testing");
	web.dragAndDropElement(testing.getSeleniumImage(), testing.getCartArea());
	web.scollToElement(testing.getFacebookIcon());
	testing.clickFacebookIcon();
	web.handleChildBroeser();
	soft.assertAll();
}
}
