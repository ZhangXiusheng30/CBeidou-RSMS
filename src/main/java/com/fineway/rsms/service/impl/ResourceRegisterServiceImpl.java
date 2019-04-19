package com.fineway.rsms.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.bean.ResourceRegister;
import com.fineway.rsms.common.Constants;
import com.fineway.rsms.dao.ResourceInfoMapper;
import com.fineway.rsms.dao.ResourceRegisterMapper;
import com.fineway.rsms.service.ResourceRegisterService;

@Service
public class ResourceRegisterServiceImpl implements ResourceRegisterService {

	@Autowired
	private ResourceRegisterMapper resourceRegisterMapper;
	
	@Autowired
	private ResourceInfoMapper resourceInfoMapper;
	
	@Override
	@Transactional
	public void save(ResourceInfo resourceInfo) throws Exception{
		ResourceRegister resourceRegister = new ResourceRegister();
		resourceRegister.setResourceAuditStatus(Constants.DSH);//新增的资源为待审核状态
		resourceRegister.setCreater("张三");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");//定义日期类型格式
		resourceRegister.setCreateTime(format.format(new Date()));
		this.resourceRegisterMapper.save(resourceRegister);
		resourceInfo.setResourceId(resourceRegister.getResourceId());
		this.resourceInfoMapper.save(resourceInfo);
	}

	@Override
	@Transactional
	public void update(ResourceRegister resourceRegister) throws Exception {
		this.resourceRegisterMapper.update(resourceRegister);
	}
	
	@Override
	@Transactional
	public void delete(int resourceId) throws Exception {
		this.resourceRegisterMapper.delete(resourceId);
	}

	@Override
	@Transactional
	public ResourceRegister findById(int resourceId) throws Exception {
		return this.resourceRegisterMapper.findById(resourceId);
	}

	@Override
	@Transactional
	public void auditResourceInfo(ResourceRegister resourceRegister) throws Exception {
		resourceRegister.setResourceAuditor("李四");
		resourceRegister.setResourceAuditTime(new Date());
		resourceRegister.setResourceAuditStatus(resourceRegister.getResourceAuditStatus());
		if(Constants.SHTG.equals(resourceRegister.getResourceAuditStatus())) {
			//如果审核状态为审核通过，设置资源发布状态为待发布
			resourceRegister.setResourceReleaseStatus(Constants.DFB);
		}
		this.resourceRegisterMapper.auditResourceInfo(resourceRegister);
	}

	@Override
	public void publishResource(int resourceId, String resourceReleaseStatus) throws Exception {
		ResourceRegister resourceRegister = new ResourceRegister();
		resourceRegister.setResourceId(resourceId);
		resourceRegister.setResourceReleaseStatus(resourceReleaseStatus);
		resourceRegister.setResourcePublisher("王五");
		resourceRegister.setResourceReleaseTime(new Date());
		this.resourceRegisterMapper.publishResource(resourceRegister);
	}
	
}
