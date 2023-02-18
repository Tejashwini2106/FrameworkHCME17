package testscripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericlibraries.BaseClass;

public class FristTest extends BaseClass
{
  @Test 
  public void fristTest()
  {
	  SoftAssert soft = new SoftAssert();
	 home.clickGrears();
	 home.clickSkillrarydemoApp();
	 web.handleChildBroeser();
	 
	 soft.assertTrue(skillraryDemo.getPageHeader().isDisplayed());
	 
	 skillraryDemo.mouseHoverTocourse(web);
	 skillraryDemo.clickSeleniumTraining();
	 
	 soft.assertEquals(selenium.getPageHeader(), "Selenium Training");
	 
	 selenium.doubleClickPlusButton(web);
	 selenium.clickAddToCart();
	 web.handleAlert();
	 web.explicitWait(time, selenium.getItemAddedMessage());
	 web.takeScreenshot();
	 soft.assertTrue(selenium.getItemAddedMessage().isDisplayed());
	  soft.assertAll();  
	  
	  
	  
  }}