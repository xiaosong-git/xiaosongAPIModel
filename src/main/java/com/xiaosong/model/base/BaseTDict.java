package com.xiaosong.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseTDict<M extends BaseTDict<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Long id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public M setDictCode(java.lang.String dictCode) {
		set("dict_code", dictCode);
		return (M)this;
	}
	
	public java.lang.String getDictCode() {
		return getStr("dict_code");
	}

	public M setDictText(java.lang.String dictText) {
		set("dict_text", dictText);
		return (M)this;
	}
	
	public java.lang.String getDictText() {
		return getStr("dict_text");
	}

}