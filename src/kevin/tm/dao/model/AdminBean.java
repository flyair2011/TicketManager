package kevin.tm.dao.model;

public class AdminBean {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Admin.LoginId
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	private String loginid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Admin.LoginPwd
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	private String loginpwd;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column Admin.AdminName
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	private String adminname;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Admin.LoginId
	 * @return  the value of Admin.LoginId
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public String getLoginid() {
		return loginid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Admin.LoginId
	 * @param loginid  the value for Admin.LoginId
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public void setLoginid(String loginid) {
		this.loginid = loginid == null ? null : loginid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Admin.LoginPwd
	 * @return  the value of Admin.LoginPwd
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public String getLoginpwd() {
		return loginpwd;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Admin.LoginPwd
	 * @param loginpwd  the value for Admin.LoginPwd
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd == null ? null : loginpwd.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column Admin.AdminName
	 * @return  the value of Admin.AdminName
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public String getAdminname() {
		return adminname;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column Admin.AdminName
	 * @param adminname  the value for Admin.AdminName
	 * @mbggenerated  Mon Mar 03 20:49:21 CST 2014
	 */
	public void setAdminname(String adminname) {
		this.adminname = adminname == null ? null : adminname.trim();
	}
}