package kevin.tm.dao.model;

public class AdminBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.loginid
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    private String loginid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.loginpwd
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    private String loginpwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.adminname
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    private String adminname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.loginid
     *
     * @return the value of admin.loginid
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public String getLoginid() {
        return loginid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.loginid
     *
     * @param loginid the value for admin.loginid
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public void setLoginid(String loginid) {
        this.loginid = loginid == null ? null : loginid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.loginpwd
     *
     * @return the value of admin.loginpwd
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public String getLoginpwd() {
        return loginpwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.loginpwd
     *
     * @param loginpwd the value for admin.loginpwd
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.adminname
     *
     * @return the value of admin.adminname
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.adminname
     *
     * @param adminname the value for admin.adminname
     *
     * @mbggenerated Tue Mar 11 14:14:51 CST 2014
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }
}