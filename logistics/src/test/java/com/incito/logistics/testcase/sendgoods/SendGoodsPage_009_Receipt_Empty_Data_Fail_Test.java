package com.incito.logistics.testcase.sendgoods;

import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.incito.logistics.pages.SendGoodsPage;
import com.incito.logistics.pages.pageshelper.SendGoodsPageHelper;
import com.incito.logistics.plugins.father.SendGoodsFather;


/**
 * @author xy-incito-wy
 * @Description 测试用例：发布货源界面，不输入收货地，其他都输入，点击发布货源按钮不能发布成功
 * */
public class SendGoodsPage_009_Receipt_Empty_Data_Fail_Test extends SendGoodsFather {

	@Test(dataProvider="data")
	public void sendReceiptEmptyDataFailTest(ITestContext context,Map<String, String> data) {
		SendGoodsFather.sendGoodsParpare(context, seleniumUtil);
		SendGoodsPageHelper.typeGoodsInfo(seleniumUtil, SendGoodsPage.SGP_BUTTON_HEAVYGOODS, SendGoodsPage.SGP_BUTTON_GOODSDATE7, 
				data.get("SGP_INPUT_GOODSORIGINALCITY"), data.get("SGP_INPUT_GOODSRECEIPTCITY"), data.get("SGP_INPUT_GOODSNAME"), data.get("SGP_INPUT_GOODSDETAILS"),
				data.get("SGP_INPUT_VOLUME"), data.get("SGP_INPUT_COUNT"), data.get("SGP_INPUT_CARLENGTH"), data.get("SGP_INPUT_CARTYPE"), 
				data.get("SGP_INPUT_INFOFARE"), data.get("SGP_INPUT_FARE"), data.get("SGP_INPUT_DECLAREVALUE"), data.get("SGP_INPUT_INSTRUCTION"));
		SendGoodsPageHelper.enterPage(seleniumUtil, SendGoodsPage.SGP_BUTTON_SEND);
		SendGoodsPageHelper.checkSendStatus(seleniumUtil);
		
	}
	

}
