package com.fineway.rsms.vo;

import java.util.Date;

public class ResourceVO {
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
	private Integer resourceInfoId;// 主键
	private String resourceType;// 资源类型
	private String resourceName;// 资源名称
	private String resourceDirectory;// 资源目录
	private String resourceDescription;// 资源描述
	private String resourceProvider;// 资源提供人
	private String resourceInstitution;// 资源所属机构

	public ResourceVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceVO(Integer resourceId, String resourceAuditStatus, String resourceAuditor, Date resourceAuditTime,
			String resourceReleaseStatus, String resourcePublisher, Date resourceReleaseTime, String creater,
			Date createTime, String modifier, Date modifyTime, String remarks, Integer resourceInfoId,
			String resourceType, String resourceName, String resourceDirectory, String resourceDescription,
			String resourceProvider, String resourceInstitution) {
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
		this.resourceInfoId = resourceInfoId;
		this.resourceType = resourceType;
		this.resourceName = resourceName;
		this.resourceDirectory = resourceDirectory;
		this.resourceDescription = resourceDescription;
		this.resourceProvider = resourceProvider;
		this.resourceInstitution = resourceInstitution;
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

	public Integer getResourceInfoId() {
		return resourceInfoId;
	}

	public void setResourceInfoId(Integer resourceInfoId) {
		this.resourceInfoId = resourceInfoId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	public String getResourceDirectory() {
		return resourceDirectory;
	}

	public void setResourceDirectory(String resourceDirectory) {
		this.resourceDirectory = resourceDirectory;
	}

	public String getResourceDescription() {
		return resourceDescription;
	}

	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}

	public String getResourceProvider() {
		return resourceProvider;
	}

	public void setResourceProvider(String resourceProvider) {
		this.resourceProvider = resourceProvider;
	}

	public String getResourceInstitution() {
		return resourceInstitution;
	}

	public void setResourceInstitution(String resourceInstitution) {
		this.resourceInstitution = resourceInstitution;
	}

}
