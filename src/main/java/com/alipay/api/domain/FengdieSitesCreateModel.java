package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建云凤蝶站点内容模型
 *
 * @author auto create
 * @since 1.0, 2017-10-13 14:20:18
 */
public class FengdieSitesCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6556391364538435287L;

	/**
	 * 站点域名，默认为空间中第一个可用域名
	 */
	@ApiField("domain")
	private String domain;

	/**
	 * 站点名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 站点过期时间，默认为发布时间 + 3 个月（调用站点发布接口时候可以再次修改）
	 */
	@ApiField("offline_time")
	private String offlineTime;

	/**
	 * 站点页面在编辑器中默认展示的数据
	 */
	@ApiField("page")
	private FengdieActivityCreatePageData page;

	/**
	 * 站点标题
	 */
	@ApiField("title")
	private String title;

	public String getDomain() {
		return this.domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getOfflineTime() {
		return this.offlineTime;
	}
	public void setOfflineTime(String offlineTime) {
		this.offlineTime = offlineTime;
	}

	public FengdieActivityCreatePageData getPage() {
		return this.page;
	}
	public void setPage(FengdieActivityCreatePageData page) {
		this.page = page;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
