package com.fineway.rsms.bean;

public class ResourceInfo {
	private Integer resourceInfoId;// 主键
	private Integer resourceId;// 资源ID
	private String resourceType;// 资源类型
	private String resourceName;// 资源名称
	private String resourceDirectory;//资源目录
	private String resourceDescription;// 资源描述
	private String resourceProvider;// 资源提供人
	private String resourceInstitution;// 资源所属机构

	public ResourceInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResourceInfo(Integer resourceInfoId, Integer resourceId, String resourceType, String resourceName,
			String resourceDirectory, String resourceDescription, String resourceProvider, String resourceInstitution) {
		super();
		this.resourceInfoId = resourceInfoId;
		this.resourceId = resourceId;
		this.resourceType = resourceType;
		this.resourceName = resourceName;
		this.resourceDirectory = resourceDirectory;
		this.resourceDescription = resourceDescription;
		this.resourceProvider = resourceProvider;
		this.resourceInstitution = resourceInstitution;
	}

	public Integer getResourceInfoId() {
		return resourceInfoId;
	}

	public void setResourceInfoId(Integer resourceInfoId) {
		this.resourceInfoId = resourceInfoId;
	}

	public Integer getResourceId() {
		return resourceId;
	}

	public void setResourceId(Integer resourceId) {
		this.resourceId = resourceId;
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
