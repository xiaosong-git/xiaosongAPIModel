package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblPosp<M extends BaseTblPosp<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setOrgId(java.lang.Long orgId) {
		set("orgId", orgId);
		return (M)this;
	}
	
	public java.lang.Long getOrgId() {
		return getLong("orgId");
	}

	public M setPospCode(java.lang.String pospCode) {
		set("pospCode", pospCode);
		return (M)this;
	}
	
	public java.lang.String getPospCode() {
		return getStr("pospCode");
	}

	public M setPospName(java.lang.String pospName) {
		set("pospName", pospName);
		return (M)this;
	}
	
	public java.lang.String getPospName() {
		return getStr("pospName");
	}

	public M setCstatus(java.lang.String cstatus) {
		set("cstatus", cstatus);
		return (M)this;
	}
	
	public java.lang.String getCstatus() {
		return getStr("cstatus");
	}

}
