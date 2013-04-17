package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import pojo.User;
import utils.WebTool;

import com.opensymphony.xwork2.ActionSupport;

import dao.IUserDao;

public class UserAction extends ActionSupport {
	IUserDao userDao;
	String logid;
	String logpass;
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	public String getLogid() {
		return logid;
	}
	public void setLogid(String logid) {
		this.logid = logid;
	}
	public String getLogpass() {
		return logpass;
	}
	public void setLogpass(String logpass) {
		this.logpass = logpass;
	}
	public String login(){
		User u=new User();
		u.setLogid(logid);
		u.setLogpass(logpass);
		WebTool.doMd5(u);
		u=userDao.login(u);
		if(u==null){
			return "login_fail";
		}else{
			HttpServletRequest request = ServletActionContext.getRequest ();
			HttpSession session=request.getSession();
			session.setAttribute("user", u);
			return "login_success";
		}
	}
}
