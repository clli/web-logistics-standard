package com.incito.logistics.testcase.login;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.base.BaseParpare;
import com.incito.logistics.pages.HomePage;
import com.incito.logistics.pages.LoginPage;
import com.incito.logistics.pages.pageshelper.AlertPageHelper;
import com.incito.logistics.pages.pageshelper.HomePageHelper;
import com.incito.logistics.pages.pageshelper.LoginPageHelper;
/**
 *@author  xy-incito
 *@Description 登陆失败-输入不正确的用户，正确密码点击登陆，提示：“用户名或密码错误,请重新登录!”
 * */
public class LoginPage_6_Fail_Incorrect_Username_Test extends BaseParpare{
    
  @Test
  public void loginFailTest_incorrectUsername(ITestContext context) {
	  String username = context.getCurrentXmlTest().getParameter("incorrectname");
	  String password = context.getCurrentXmlTest().getParameter("passcode");
	  int timeOut =Integer.valueOf(context.getCurrentXmlTest().getParameter("timeOut"));
	  int waitMillisecondsForAlert =Integer.valueOf(context.getCurrentXmlTest().getParameter("waitMillisecondsForAlert"));

	  HomePageHelper.waitHomePageToLoad(timeOut,seleniumUtil);
	  HomePageHelper.enterPage(seleniumUtil, HomePage.HP_BUTTON_LOGIN);
	  LoginPageHelper.waitLoginPageToLoad(timeOut, seleniumUtil);
	  seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME));
	  seleniumUtil.sendKeys(seleniumUtil.findElementBy(LoginPage.LP_INPUT_USERNAME), username);
	  seleniumUtil.clear(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE));
	  seleniumUtil.sendKeys(seleniumUtil.findElementBy(LoginPage.LP_INPUT_PASSCODE), password);
	  seleniumUtil.click(seleniumUtil.findElementBy(LoginPage.LP_BUTTON_LOGIN));
	  AlertPageHelper.checkAlertInfo(seleniumUtil, waitMillisecondsForAlert);
	  
  }
  
}
