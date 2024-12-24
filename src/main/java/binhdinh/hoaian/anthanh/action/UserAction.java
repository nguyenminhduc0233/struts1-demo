package binhdinh.hoaian.anthanh.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import binhdinh.hoaian.anthanh.model.User;

public class UserAction extends MappingDispatchAction {
	public ActionForward hello(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		user.setName("Nguyen Minh Duc");
		return mapping.findForward("success");
	}
	
	public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		user.setError("null");
	    return mapping.findForward("login");
	}

	public ActionForward viewUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) {
		User user = (User) form;
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		int age = 0;
		try {
	        age = Integer.parseInt(password);  // (4)
	    } catch (NumberFormatException e) {
	        age = 0;                         // (5)
	    }
		if("dadmin".equalsIgnoreCase(name)) {
			user.setError("lỗi con mẹ nó rồi");
			return mapping.findForward("error");
		}else {
			user.setName(name);
			user.setAge(age);
			return mapping.findForward("viewUser");
		}
	}

}
