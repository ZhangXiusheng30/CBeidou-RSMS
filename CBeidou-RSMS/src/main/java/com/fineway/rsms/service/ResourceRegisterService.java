package com.fineway.rsms.service;

import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.bean.ResourceRegister;
	/**
	 * 资源注册记录表服务层接口
	 * @author ZXS
	 * @since 1.0
	 */
public interface ResourceRegisterService {
	/**
	　　* 资源基本信息新增
	　　* @param ResourceInfo
	　　* @return 
	　　* @throws 
	　　*/
	public void save(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 资源基本信息修改
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void update(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 资源基本信息删除
	　　* @param resourceId
	　　* @return 
	　　* @throws 
	　　*/
	public void delete(int resourceId) throws Exception;
	/**
	　　* 根据资源ID查询资源注册信息
	　　* @param resourceId
	　　* @return ResourceRegister
	　　* @throws 
	　　*/
	public ResourceRegister findById(int resourceId) throws Exception;
	/**
	　　* 资源注册审核
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void auditResourceInfo(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 资源发布
	　　* @param ResourceRegister
	　　* @return resourceId，resourceReleaseStatus
	　　* @throws 
	　　*/
	public void publishResource(int resourceId, String resourceReleaseStatus) throws Exception;
}
