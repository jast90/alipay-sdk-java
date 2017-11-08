package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.common.consult response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-26 13:45:06
 */
public class AlipayInsAutoAutoinsprodCommonConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3144464693546657238L;

	/** 
	 * 具体内容按照业务类型对应的key值传输
	 */
	@ApiField("biz_data")
	private String bizData;

	public void setBizData(String bizData) {
		this.bizData = bizData;
	}
	public String getBizData( ) {
		return this.bizData;
	}

}
