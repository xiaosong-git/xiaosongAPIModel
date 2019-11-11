package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTCompanyAuthRange<M extends BaseTCompanyAuthRange<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setMenuId(java.lang.Long menuId) {
		set("menu_id", menuId);
		return (M)this;
	}
	
	public java.lang.Long getMenuId() {
		return getLong("menu_id");
	}

	public M setRoleId(java.lang.Long roleId) {
		set("role_id", roleId);
		return (M)this;
	}
	
	public java.lang.Long getRoleId() {
		return getLong("role_id");
	}

	public M setButtonId(java.lang.Long buttonId) {
		set("button_id", buttonId);
		return (M)this;
	}
	
	public java.lang.Long getButtonId() {
		return getLong("button_id");
	}

}
