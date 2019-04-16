package com.fineway.rsms.controller;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fineway.rsms.bean.ResourceInfo;
import com.fineway.rsms.bean.ResourceRegister;
import com.fineway.rsms.common.Constants;
import com.fineway.rsms.service.ResourceRegisterService;

@RestController
@RequestMapping("/resourceRegister")
public class ResourceRegisterController {

	private static final Logger logger = LoggerFactory.getLogger(ResourceRegisterController.class);

	@Autowired
	private ResourceRegisterService resourceRegisterService;

	@RequestMapping("/insertResourceInfo")
	public Map<String,Object> insertResourceInfo(ResourceInfo resourceInfo){
		logger.info("资源注册开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			this.resourceRegisterService.save(resourceInfo);
			jsonMap.put(Constants.DATA, "资源注册成功！");
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("资源注册失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "资源注册失败！");
		}
		logger.info("资源注册结束！");
		return jsonMap;
    }
	
	@RequestMapping("/auditResourceInfo")
	public Map<String,Object> auditResourceInfo(ResourceRegister resourceRegister){
		logger.info("资源注册审核开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			this.resourceRegisterService.auditResourceInfo(resourceRegister);
			jsonMap.put(Constants.DATA, "资源注册审核成功！");
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("资源注册审核失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "资源注册审核失败！");
		}
		logger.info("资源注册审核结束！");
		return jsonMap;
    }
	
	@RequestMapping("/publishResourceInfo")
	public Map<String,Object> publishResourceInfo(@RequestParam("resourceId") int resourceId){
		logger.info("资源发布开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			this.resourceRegisterService.publishResource(resourceId, Constants.YFB);
			jsonMap.put(Constants.DATA, "资源发布成功！");
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("资源发布失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "资源发布失败！");
		}
		logger.info("资源发布结束！");
		return jsonMap;
    }
	
	@RequestMapping("/cancelPublishResourceInfo")
	public Map<String,Object> cancelPublishResourceInfo(@RequestParam("resourceId") int resourceId){
		logger.info("取消资源发布开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			this.resourceRegisterService.publishResource(resourceId, Constants.QXFB);
			jsonMap.put(Constants.DATA, "取消资源发布成功！");
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("取消资源发布失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "取消资源发布失败！");
		}
		logger.info("取消资源发布结束！");
		return jsonMap;
    }
	
}
