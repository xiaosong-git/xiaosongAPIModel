package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTOrg<M extends BaseTOrg<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setOrgCode(java.lang.String orgCode) {
		set("org_code", orgCode);
		return (M)this;
	}
	
	public java.lang.String getOrgCode() {
		return getStr("org_code");
	}

	public M setOrgName(java.lang.String orgName) {
		set("org_name", orgName);
		return (M)this;
	}
	
	public java.lang.String getOrgName() {
		return getStr("org_name");
	}

	public M setSid(java.lang.Long sid) {
		set("sid", sid);
		return (M)this;
	}
	
	public java.lang.Long getSid() {
		return getLong("sid");
	}

	public M setIstop(java.lang.String istop) {
		set("istop", istop);
		return (M)this;
	}
	
	public java.lang.String getIstop() {
		return getStr("istop");
	}

	public M setOrgIcon(java.lang.String orgIcon) {
		set("org_icon", orgIcon);
		return (M)this;
	}
	
	public java.lang.String getOrgIcon() {
		return getStr("org_icon");
	}

	public M setRelationNo(java.lang.String relationNo) {
		set("relation_no", relationNo);
		return (M)this;
	}
	
	public java.lang.String getRelationNo() {
		return getStr("relation_no");
	}

	public M setSstatus(java.lang.String sstatus) {
		set("sstatus", sstatus);
		return (M)this;
	}
	
	public java.lang.String getSstatus() {
		return getStr("sstatus");
	}

	public M setOrgType(java.lang.String orgType) {
		set("orgType", orgType);
		return (M)this;
	}
	
	public java.lang.String getOrgType() {
		return getStr("orgType");
	}

	public M setRealName(java.lang.String realName) {
		set("realName", realName);
		return (M)this;
	}
	
	public java.lang.String getRealName() {
		return getStr("realName");
	}

	public M setPhone(java.lang.String phone) {
		set("phone", phone);
		return (M)this;
	}
	
	public java.lang.String getPhone() {
		return getStr("phone");
	}

	public M setAddr(java.lang.String addr) {
		set("addr", addr);
		return (M)this;
	}
	
	public java.lang.String getAddr() {
		return getStr("addr");
	}

	public M setCreateDate(java.lang.String createDate) {
		set("createDate", createDate);
		return (M)this;
	}
	
	public java.lang.String getCreateDate() {
		return getStr("createDate");
	}

	public M setProvince(java.lang.String province) {
		set("province", province);
		return (M)this;
	}
	
	public java.lang.String getProvince() {
		return getStr("province");
	}

	public M setCity(java.lang.String city) {
		set("city", city);
		return (M)this;
	}
	
	public java.lang.String getCity() {
		return getStr("city");
	}

	public M setArea(java.lang.String area) {
		set("area", area);
		return (M)this;
	}
	
	public java.lang.String getArea() {
		return getStr("area");
	}

}