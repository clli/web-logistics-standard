package com.incito.logistics.testcase.userBaseInfo;

import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.pages.UserBaseInfoPage;
import com.incito.logistics.pages.pageshelper.UserBaseInfoPagerHelper;
import com.incito.logistics.plugins.father.UserBaseInfoUnattestedFather;

/**
 * @author xy-incito-wk
 * @Description 已认证用户修改修改：头像、生日、QQ
 *
 * */
public class UserBaseInfoPage_014_Unattested_PhotoBirthdayQQ_Test extends UserBaseInfoUnattestedFather {
	@Test(dataProvider = "data")
	public void userBaseInfoPageFailTelIdcardCompanyAddress(ITestContext context, Map<String, String> data) {
		UserBaseInfoUnattestedFather.userBaseInfoParpare(context, seleniumUtil, true);

		UserBaseInfoPagerHelper.upLoadPhoto(context, seleniumUtil, UserBaseInfoPage.BUIP_BUTTON_PHOTO, "res/img/userBaseInfo/自拍.png");
		UserBaseInfoPagerHelper.typeUserBaseInfo(seleniumUtil, 
				data.get("BUIP_TEXT_SEX"), data.get("BUIP_INPUT_BIRTHDAY"),
				data.get("BUIP_INPUT_QQ"), data.get("BUIP_INPUT_EMAIL"));
		UserBaseInfoPagerHelper.saveOrCancel(seleniumUtil, UserBaseInfoPage.BUIP_BUTTON_SAVE, true);
		seleniumUtil.waitForElementToLoad(timeOut, UserBaseInfoPage.UBIP_TITLE_USERINFO);
		UserBaseInfoPagerHelper.checkUserBaseInfo(seleniumUtil, 
				data.get("BUIP_TEXT_SEX"), data.get("BUIP_INPUT_BIRTHDAY"),
				data.get("BUIP_INPUT_QQ"), data.get("BUIP_INPUT_EMAIL"));
	}
}