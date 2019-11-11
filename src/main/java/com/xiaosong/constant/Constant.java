package com.xiaosong.constant;

import com.jfinal.kit.PathKit;

/**
 * 
 * @author wgm
 *create by 2019-11-05
 * 系统常量
 */
public class Constant {
	
	
	/**
	 * 默认上传临时文件夹 PathKit.getWebRootPath() +"/upload/temp";
	 */
	public static final String BASE_UPLOAD_PATH = PathKit.getWebRootPath() +"/upload/temp";
	
	
	/**
	 * 默认下载临时文件夹 PathKit.getWebRootPath() +"/download/temp";
	 */
	public static final String BASE_DOWNLOAD_PATH = PathKit.getWebRootPath() +"/download/temp";
	
	

	/**
	 * 账号密码管理session 放入缓存session中
	 */
	public final static String SYS_ACCOUNT = "SYS_ACCOUNT";
	/**
	 * 权限缓存也放入session
	 */
	public final static String SYS_ROLE_MENU = "SYS_ROLE_MENU";
	
	/**
	 * 是否开发模式-生产是自动加载改为false即可，自动加载生产配置文件
	 */
	public final static Boolean DEV_MODE = true;
	

}
