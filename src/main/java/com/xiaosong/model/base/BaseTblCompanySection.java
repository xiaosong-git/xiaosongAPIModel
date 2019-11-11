package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblCompanySection<M extends BaseTblCompanySection<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setSectionCode(java.lang.String sectionCode) {
		set("sectionCode", sectionCode);
		return (M)this;
	}
	
	public java.lang.String getSectionCode() {
		return getStr("sectionCode");
	}

	public M setSectionName(java.lang.String sectionName) {
		set("sectionName", sectionName);
		return (M)this;
	}
	
	public java.lang.String getSectionName() {
		return getStr("sectionName");
	}

	public M setCompanyId(java.lang.Long companyId) {
		set("companyId", companyId);
		return (M)this;
	}
	
	public java.lang.Long getCompanyId() {
		return getLong("companyId");
	}

}