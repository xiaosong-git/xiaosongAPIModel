package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTblTerminal<M extends BaseTblTerminal<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setTerminalNo(java.lang.String terminalNo) {
		set("terminalNo", terminalNo);
		return (M)this;
	}
	
	public java.lang.String getTerminalNo() {
		return getStr("terminalNo");
	}

	public M setTerminalCstatus(java.lang.String terminalCstatus) {
		set("terminalCstatus", terminalCstatus);
		return (M)this;
	}
	
	public java.lang.String getTerminalCstatus() {
		return getStr("terminalCstatus");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setOrgId(java.lang.String orgId) {
		set("orgId", orgId);
		return (M)this;
	}
	
	public java.lang.String getOrgId() {
		return getStr("orgId");
	}

}
