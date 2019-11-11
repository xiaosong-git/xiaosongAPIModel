package com.xiaosong.interceptor;

import java.util.List;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
/**
 * 权限过滤器
 * @author Administrator
 *
 */
public class AuthInterceptor implements Interceptor {

	@Override
	public void intercept(Invocation inv) {
		Controller con = inv.getController();
//		String sessionId = con.getHeader(Constant.ADMIN_SESSION_ID);
//		SysAccount account = LoginService.me.getAccountCacheWithSessionId(sessionId);
//		if (validateAuth(account, inv.getControllerKey())) {
//			inv.invoke();
//		}else{
//			con.renderJson(RetKit.fail(RetConstant.CODE_NO_AUTH, "你無權限訪問該路徑"));
//		}
//	}
//	
//	private boolean validateAuth(SysAccount account,String controllerKey){
//		if (account.isSysAdmin()) {
//			return true;
//		}
//		List<SysMenu> list = RoleService.me.findMenuListByRoleId(account.getRoleId());
//		boolean isHaveAuth = false;
//		for (SysMenu menu : list) {
//			if (menu.getAction().equals(controllerKey)) {
//				isHaveAuth = true;
//				break;
//			}
//		}
//		return isHaveAuth;
	}

}
