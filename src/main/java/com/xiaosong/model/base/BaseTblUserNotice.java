package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblUserNotice<M extends BaseTblUserNotice<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setUserId(java.lang.Integer userId) {
		set("userId", userId);
		return (M)this;
	}
	
	public java.lang.Integer getUserId() {
		return getInt("userId");
	}

	public M setMaxNoticeId(java.lang.Integer maxNoticeId) {
		set("maxNoticeId", maxNoticeId);
		return (M)this;
	}
	
	public java.lang.Integer getMaxNoticeId() {
		return getInt("maxNoticeId");
	}

}
