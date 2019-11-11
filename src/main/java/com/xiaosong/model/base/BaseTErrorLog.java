package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTErrorLog<M extends BaseTErrorLog<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setOrgCode(java.lang.String orgCode) {
		set("orgCode", orgCode);
		return (M)this;
	}
	
	public java.lang.String getOrgCode() {
		return getStr("orgCode");
	}

	public M setLogContext(java.lang.String logContext) {
		set("logContext", logContext);
		return (M)this;
	}
	
	public java.lang.String getLogContext() {
		return getStr("logContext");
	}

	public M setErrorType(java.lang.String errorType) {
		set("errorType", errorType);
		return (M)this;
	}
	
	public java.lang.String getErrorType() {
		return getStr("errorType");
	}

	public M setDeviceId(java.lang.String deviceId) {
		set("deviceId", deviceId);
		return (M)this;
	}
	
	public java.lang.String getDeviceId() {
		return getStr("deviceId");
	}

	public M setErrorTime(java.lang.String errorTime) {
		set("errorTime", errorTime);
		return (M)this;
	}
	
	public java.lang.String getErrorTime() {
		return getStr("errorTime");
	}

	public M setExt1(java.lang.String ext1) {
		set("ext1", ext1);
		return (M)this;
	}
	
	public java.lang.String getExt1() {
		return getStr("ext1");
	}

	public M setExt2(java.lang.String ext2) {
		set("ext2", ext2);
		return (M)this;
	}
	
	public java.lang.String getExt2() {
		return getStr("ext2");
	}

	public M setExt3(java.lang.String ext3) {
		set("ext3", ext3);
		return (M)this;
	}
	
	public java.lang.String getExt3() {
		return getStr("ext3");
	}

}