package com.xiaosong.common.admin;

import com.jfinal.core.Controller;
import com.xiaosong.util.RetUtil;

/**
 * 测试控制器
 * @author Administrator
 *
 */
public class DemoController extends Controller{
	public DemoService srv = DemoService.me;
	
	public void index(){
		System.out.println(srv.findTblNews());
		renderJson(RetUtil.ok("news",srv.findTblNews()));
	}
	
	
	public void aa(){
		renderText("test");
	}

}
