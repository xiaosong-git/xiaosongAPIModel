package com.xiaosong.common.admin;

import com.jfinal.plugin.activerecord.Db;
import com.xiaosong.model.TblNews;
/**
 * 测试Service包含dao的操作
 * @author Administrator
 *
 */
public class DemoService {
	
	public static final	DemoService me = new DemoService();
	static final TblNews dao = TblNews.dao;
	
	public TblNews findTblNews(){
		//获取jxt.sql 文件已经在插件加载时加载完毕 
		//Sqlpara sql = Db.getSqlPara(key, data); key为jxt文件中的名称，data为传入的参数（Map）
		//Sqlpara sql = dao.getSqlPara(key, data)
		return dao.findById(1);
	}

}
