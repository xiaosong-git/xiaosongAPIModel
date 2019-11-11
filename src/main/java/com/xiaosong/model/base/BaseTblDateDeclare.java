package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblDateDeclare<M extends BaseTblDateDeclare<M>> extends Model<M> implements IBean {

	public M setClaDate(java.util.Date claDate) {
		set("cla_date", claDate);
		return (M)this;
	}
	
	public java.util.Date getClaDate() {
		return get("cla_date");
	}

	public M setWeek(java.lang.String week) {
		set("week", week);
		return (M)this;
	}
	
	public java.lang.String getWeek() {
		return getStr("week");
	}

}