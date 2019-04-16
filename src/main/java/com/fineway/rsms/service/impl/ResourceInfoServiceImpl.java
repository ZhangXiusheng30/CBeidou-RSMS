package com.fineway.rsms.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.dao.ResourceInfoMapper;
import com.fineway.rsms.service.ResourceInfoService;
import com.fineway.rsms.vo.ResourceVO;

@Service
public class ResourceInfoServiceImpl implements ResourceInfoService{
	
	@Autowired
	private ResourceInfoMapper resourceInfoMapper;

	@Override
	@Transactional
	public void save(ResourceInfo resourceInfo) throws Exception{
		this.resourceInfoMapper.save(resourceInfo);
	}

	@Override
	@Transactional
	public void delete(int resourceInfoId) throws Exception {
		this.resourceInfoMapper.delete(resourceInfoId);
	}

	@Override
	@Transactional
	public void update(ResourceInfo resourceInfo) throws Exception {
		this.resourceInfoMapper.update(resourceInfo);
	}

	@Override
	@Transactional
	public List<ResourceVO> getResourceInfo(ResourceVO resourceVO) throws Exception {
		return this.resourceInfoMapper.getResourceInfo(resourceVO);
	}

	@Override
	@Transactional
	public ResourceVO getResourceInfoById(int resourceId) throws Exception {
		return this.resourceInfoMapper.getResourceInfoById(resourceId);
	}

}
