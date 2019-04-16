package com.fineway.rsms.bean;

import java.util.Date;

public class ResourceRegister {
	private Integer resourceId;// 资源ID
	private String resourceAuditStatus;// 资源审核状态
	private String resourceAuditor;// 资源审核人
	private Date resourceAuditTime;// 资源审核时间
	private String resourceReleaseStatus;// 资源发布状态
	private String resourcePublisher;// 资源发布人
	private Date resourceReleaseTime;// 资源发布时间
	private String creater;// 创建人
	private Date createTime;// 创建时间
	private String modifier;// 修改人
	private Date modifyTime;// 修改时间
	private String remarks;// 备注

	public ResourceRegister() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceRegister(Integer resourceId, String resourceAuditStatus, String resourceAuditor,
			Date resourceAuditTime, String resourceReleaseStatus, String resourcePublisher, Date resourceReleaseTime,
			String creater, Date createTime, String modifier, Date modifyTime, String remarks) {
		super();
		this.resourceId = resourceId;
		this.resourceAuditStatus = resourceAuditStatus;
		this.resourceAuditor = resourceAuditor;
		this.resourceAuditTime = resourceAuditTime;
		this.resourceReleaseStatus = resourceReleaseStatus;
		this.resourcePublisher = resourcePublisher;
		this.resourceReleaseTime = resourceReleaseTime;
		this.creater = creater;
		this.createTime = createTime;
		this.modifier = modifier;
		this.modifyTime = modifyTime;
		this.remarks = remarks;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceAuditStatus() {
		return resourceAuditStatus;
	}

	public void setResourceAuditStatus(String resourceAuditStatus) {
		this.resourceAuditStatus = resourceAuditStatus;
	}

	public String getResourceAuditor() {
		return resourceAuditor;
	}

	public void setResourceAuditor(String resourceAuditor) {
		this.resourceAuditor = resourceAuditor;
	}

	public Date getResourceAuditTime() {
		return resourceAuditTime;
	}

	public void setResourceAuditTime(Date resourceAuditTime) {
		this.resourceAuditTime = resourceAuditTime;
	}

	public String getResourceReleaseStatus() {
		return resourceReleaseStatus;
	}

	public void setResourceReleaseStatus(String resourceReleaseStatus) {
		this.resourceReleaseStatus = resourceReleaseStatus;
	}

	public String getResourcePublisher() {
		return resourcePublisher;
	}

	public void setResourcePublisher(String resourcePublisher) {
		this.resourcePublisher = resourcePublisher;
	}

	public Date getResourceReleaseTime() {
		return resourceReleaseTime;
	}

	public void setResourceReleaseTime(Date resourceReleaseTime) {
		this.resourceReleaseTime = resourceReleaseTime;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
