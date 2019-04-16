package com.fineway.rsms.dao;

import java.util.List;
import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.vo.ResourceVO;
	/**
	 * 资源基本信息表Mapper类
	 * @author ZXS
	 * @since 1.0
	 */
public interface ResourceInfoMapper {
	/**
	　　* 资源基本信息表新增记录
	　　* @param ResourceInfo
	　　* @return 
	　　* @throws 
	　　*/
	public void save(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 资源基本信息表删除记录
	　　* @param resourceInfoId
	　　* @return 
	　　* @throws 
	　　*/
	public void delete(int resourceInfoId) throws Exception;
	/**
	　　* 资源基本信息表修改记录
	　　* @param ResourceInfo
	　　* @return 
	　　* @throws 
	　　*/
	public void update(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 根据查询条件查询资源基本信息表记录
	　　* @param ResourceInfo
	　　* @return List<ResourceInfo>
	　　* @throws 
	　　*/
	public List<ResourceInfo> findByCondition(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 根据资源ID查询资源基本信息
	　　* @param resourceId
	　　* @return ResourceVO
	　　* @throws 
	　　*/
	public ResourceVO getResourceInfoById(int resourceId) throws Exception;
	/**
	　　* 根据查询条件查询资源基本信息
	　　* @param ResourceVO
	　　* @return List<ResourceVO>
	　　* @throws 
	　　*/
	public List<ResourceVO> getResourceInfo(ResourceVO resourceVO) throws Exception;
	
}
