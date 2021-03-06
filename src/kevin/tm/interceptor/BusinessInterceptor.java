package kevin.tm.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BusinessInterceptor extends AbstractInterceptor {

    /**
     * 
     */
    private static final long serialVersionUID = -6743361066288486783L;

    public String getExcludeActions() {
	return this.excludeActions;
    }

    public void setExcludeActions(String excludeActions) {
	this.excludeActions = excludeActions;
    }

    // 不需要session检查的Action列表
    private String excludeActions;

    @Override
    public String intercept(ActionInvocation invocation) throws Exception {

	System.out.println("BusinessInterceptor intercept() invoked! ");
	//System.out.println(this.excludeActions);
	String actionName = invocation.getProxy().getActionName();

	if (this.doExcludeActions(actionName)) {
	    // System.out.println("ddddd");
	    return invocation.invoke();
	}
	this.before(invocation);
	// 处理非法请求
	/*
	 * AdminBean adminBean = (AdminBean)
	 * invocation.getInvocationContext().getSession().get("User"); if
	 * (adminBean == null) { return "noLogin"; }
	 */
	String result = "";

	try {
	    result = invocation.invoke();
	    return result;
	} catch (Exception ex) {
	    ServletActionContext.getResponse().setStatus(500);
	    ex.printStackTrace();

	}

	this.after(invocation, result);

	return result;
    }

    /**
     * 验证登陆等...
     * 
     * @param invocation
     * @return
     * @throws Exception
     */
    public void before(ActionInvocation invocation) throws Exception {
	// ...
    }

    /**
     * 记录日志等...
     * 
     * @param invocation
     * @return
     * @throws Exception
     */
    public void after(ActionInvocation invocation, String result)
	    throws Exception {
	// ...
    }

    /**
     * 验证方法是否需要拦截
     * 
     * @param actionName
     * @return boolean
     */
    private boolean doExcludeActions(String actionName) {
	if (this.excludeActions == null) {
	    return false;
	}
	String[] excludeAction = this.excludeActions.split(",");
	for (int i = 0; i < excludeAction.length; i++) {
	    if (actionName.equals(excludeAction[i])) {
		return true;
	    }
	}
	return false;
    }

}
