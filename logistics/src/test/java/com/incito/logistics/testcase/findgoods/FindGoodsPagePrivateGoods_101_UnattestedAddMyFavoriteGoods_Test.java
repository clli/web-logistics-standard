package com.incito.logistics.testcase.findgoods;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.pages.FindGoodsPage;
import com.incito.logistics.pages.pageshelper.FindGoodsPageHelper;
import com.incito.logistics.plugins.father.FindGoodsFather;

/**
 * 
 * @author xy-incito-wk
 * @Description 测试用例：未认证的用户登录，隐藏信息的检验
 */
public class FindGoodsPagePrivateGoods_101_UnattestedAddMyFavoriteGoods_Test extends FindGoodsFather {
	@Test
	public void FindGoodsPagePublicGoodsInfoCheck(ITestContext context) {
		FindGoodsFather.UnattestedFindGoodsParpare(context, seleniumUtil);
		
		FindGoodsPageHelper.publicGoodsChangeFavoGoods(seleniumUtil, FindGoodsPage.FGP_GOODS_BUTTON_MYFAVO);
	}
}