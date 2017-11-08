package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券平台直发券接口
 *
 * @author auto create
 * @since 1.0, 2017-06-19 11:26:59
 */
public class AlipayMarketingVoucherDirectSendModel extends AlipayObject {

	private static final long serialVersionUID = 8117349497744114795L;

	/**
	 * 券金额(单位:分)
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 业务发生时间，格式为yyyy-MM-dd HH:mm:ss。
	 */
	@ApiField("biz_date")
	private Date bizDate;

	/**
	 * {"LEHUA_IS_ALGO_MONEY":"F","LEHUA_IS_MULTIPLIED":"F","LEHUA_MULTIPLIED_PRICE":"0.08","LEHUA_MULTIPLY_TIMES":"1.0","LEHUA_ORIGIN_PRICE":"0.08","camp_id":"1332546","camp_type":"PLATFORM_CAMP"}
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * 备注信息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 业务订单号，每次操作不可重复。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 模板编码，创建模板后生成。
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * USERID(支付宝用户2088账号)
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Date getBizDate() {
		return this.bizDate;
	}
	public void setBizDate(Date bizDate) {
		this.bizDate = bizDate;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
