package com.fineway.rsms.common;

public class Constants {
	
	/*-------------------返回结果，key-----------------------*/
	public static final String DATA = "data";//结果集key
	public static final String ERROR = "error";//错误信息key
	public static final String RESULT = "result";//结果key
	
	/*-------------------返回结果，value---------------------*/
	public static final String SUCCESS = "1";//成功
	public static final String FAIL = "0";//失败
	
	/*-------------------资源注册审核状态-----------------------*/
	public static final String DSH = "01";//待审核
	public static final String SHTG = "02";//审核通过
	public static final String SHBTG = "03";//审核不通过
	
	/*-------------------资源发布状态-----------------------*/
	public static final String DFB = "01";//待发布
	public static final String YFB = "02";//已发布
	public static final String QXFB = "03";//取消发布
	
	/*-------------------资源类型-----------------------*/
	public static final String SJZY = "01";//数据资源
	public static final String FWZY = "02";//服务资源
	
}
