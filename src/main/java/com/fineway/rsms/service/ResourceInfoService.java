package com.fineway.rsms.service;

import java.util.List;
import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.vo.ResourceVO;
	/**
	 * 资源基本信息表服务层接口
	 * @author ZXS
	 * @since 1.0
	 */
public interface ResourceInfoService {
	/**
	　　* 资源新增
	　　* @param ResourceInfo
	　　* @return 
	　　* @throws 
	　　*/
	public void save(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 资源删除
	　　* @param resourceInfoId
	　　* @return 
	　　* @throws 
	　　*/
	public void delete(int resourceInfoId) throws Exception;
	/**
	　　* 资源修改
	　　* @param ResourceInfo
	　　* @return 
	　　* @throws 
	　　*/
	public void update(ResourceInfo resourceInfo) throws Exception;
	/**
	　　* 根据资源ID查找资源信息
	　　* @param resourceId
	　　* @return ResourceVO
	　　* @throws 
	　　*/
	public ResourceVO getResourceInfoById(int resourceId) throws Exception;
	/**
	　　* 根据查询条件查找资源信息
	　　* @param ResourceVO
	　　* @return List<ResourceVO>
	　　* @throws 
	　　*/
	public List<ResourceVO> getResourceInfo(ResourceVO resourceVO) throws Exception;
}
