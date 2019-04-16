package com.fineway.rsms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fineway.rsms.common.Constants;
import com.fineway.rsms.service.ResourceInfoService;
import com.fineway.rsms.vo.ResourceVO;

@RestController
@RequestMapping("/resourceInfo")
public class ResourceInfoController {
	
	private static final Logger logger = LoggerFactory.getLogger(ResourceInfoController.class);

	@Autowired
	private ResourceInfoService ResourceInfoService;

	@RequestMapping("/getResourceMap")
	public Map<String,Object> getResourceMap(ResourceVO resourceVO){
		logger.info("根据查询条件获取资源列表开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			List<ResourceVO> list = this.ResourceInfoService.getResourceInfo(resourceVO);
			jsonMap.put(Constants.DATA, list);
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("获取资源信息列表失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "获取资源信息列表失败！"+e.getMessage());
		}
		logger.info("根据查询条件获取资源列表结束！");
		return jsonMap;
    }
	
	@RequestMapping("/getResourceInfoById")
	public Map<String,Object> getResourceInfoById(@RequestParam("resourceId") int resourceId){
		logger.info("根据资源ID获取资源信息开始！");
		Map<String, Object> jsonMap = new HashMap<String, Object>();
		try {
			ResourceVO resourceVO = this.ResourceInfoService.getResourceInfoById(resourceId);
			jsonMap.put(Constants.DATA, resourceVO);
			jsonMap.put(Constants.RESULT, Constants.SUCCESS);
			jsonMap.put(Constants.ERROR, null);
		} catch (Exception e) {
			logger.error("获取资源信息失败！" + e.getMessage(), e);
			jsonMap.put(Constants.RESULT, Constants.FAIL);
			jsonMap.put(Constants.ERROR, "获取资源信息失败！"+e.getMessage());
		}
		logger.info("根据资源ID获取资源信息结束！");
		return jsonMap;
    }
	
}
