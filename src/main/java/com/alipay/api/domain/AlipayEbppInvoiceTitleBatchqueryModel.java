package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 获取指定抬头的发票要素列表
 *
 * @author auto create
 * @since 1.0, 2017-09-22 17:40:46
 */
public class AlipayEbppInvoiceTitleBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6633686796423265889L;

	/**
	 * 查询起始时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.其中一个值不能为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("end_invoice_date")
	private String endInvoiceDate;

	/**
	 * 查询票种列表
可选值
PLAIN：增值税电子普通发票
SPECIAL：增值税专用发票
PLAIN_INVOICE:增值税普通发票
PAPER_INVOICE:增值税普通发票（卷式）
SALSE_INVOICE:机动车销售统一发票
	 */
	@ApiListField("invoice_kind_list")
	@ApiField("string")
	private List<String> invoiceKindList;

	/**
	 * 查询结果上限笔数；
不设置时默认200笔上限；
上限为500笔
	 */
	@ApiField("limit_size")
	private Long limitSize;

	/**
	 * 查询起始时间，精确到天（按开票日期查询）
start_invoice_date和end_invoice_date传值要求
1.同时为空时，返回最近半年200条数据
2.其中一个值不能为空
3.结束日期不能大于当前日期
4.开始时间和结束时间跨度不能超过6个月
	 */
	@ApiField("start_invoice_date")
	private String startInvoiceDate;

	/**
	 * 抬头名称
	 */
	@ApiField("title_name")
	private String titleName;

	public String getEndInvoiceDate() {
		return this.endInvoiceDate;
	}
	public void setEndInvoiceDate(String endInvoiceDate) {
		this.endInvoiceDate = endInvoiceDate;
	}

	public List<String> getInvoiceKindList() {
		return this.invoiceKindList;
	}
	public void setInvoiceKindList(List<String> invoiceKindList) {
		this.invoiceKindList = invoiceKindList;
	}

	public Long getLimitSize() {
		return this.limitSize;
	}
	public void setLimitSize(Long limitSize) {
		this.limitSize = limitSize;
	}

	public String getStartInvoiceDate() {
		return this.startInvoiceDate;
	}
	public void setStartInvoiceDate(String startInvoiceDate) {
		this.startInvoiceDate = startInvoiceDate;
	}

	public String getTitleName() {
		return this.titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

}
