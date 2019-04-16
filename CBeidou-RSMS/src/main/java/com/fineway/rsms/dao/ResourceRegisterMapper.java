package com.fineway.rsms.dao;

import java.util.List;
import com.fineway.rsms.bean.ResourceRegister;
	/**
	 * 资源注册记录表Mapper类
	 * @author ZXS
	 * @since 1.0
	 */
public interface ResourceRegisterMapper {
	/**
	　　* 资源注册记录表新增记录
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void save(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 资源注册记录表删除记录
	　　* @param resourceId
	　　* @return 
	　　* @throws 
	　　*/
	public void delete(int resourceId) throws Exception;
	/**
	　　* 资源注册记录表修改记录
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void update(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 根据查询条件查询资源注册记录表记录
	　　* @param ResourceRegister
	　　* @return List<ResourceRegister>
	　　* @throws 
	　　*/
	public List<ResourceRegister> findByCondition(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 根据资源ID查询资源注册记录表记录
	　　* @param resourceId
	　　* @return ResourceRegister
	　　* @throws 
	　　*/
	public ResourceRegister findById(int resourceId) throws Exception;
	/**
	　　* 审核资源注册信息
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void auditResourceInfo(ResourceRegister resourceRegister) throws Exception;
	/**
	　　* 发布资源
	　　* @param ResourceRegister
	　　* @return 
	　　* @throws 
	　　*/
	public void publishResource(ResourceRegister resourceRegister) throws Exception;
}
