package kevin.tm.dao.model;

import java.util.Date;

public class Ticketinfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.ticketid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Integer ticketid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.ticketno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String ticketno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.tickettitle
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String tickettitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.ticketscheduleid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Integer ticketscheduleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.seatno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String seatno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.customername
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String customername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.entrytime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Date entrytime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.deadline
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Date deadline;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.checked
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Boolean checked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.schedulename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String schedulename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.routename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String routename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.startstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String startstationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.starttime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Date starttime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.endstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String endstationname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.endtime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private Date endtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ticketinfo.vehicleno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    private String vehicleno;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.ticketid
     *
     * @return the value of ticketinfo.ticketid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Integer getTicketid() {
        return ticketid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.ticketid
     *
     * @param ticketid the value for ticketinfo.ticketid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setTicketid(Integer ticketid) {
        this.ticketid = ticketid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.ticketno
     *
     * @return the value of ticketinfo.ticketno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getTicketno() {
        return ticketno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.ticketno
     *
     * @param ticketno the value for ticketinfo.ticketno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setTicketno(String ticketno) {
        this.ticketno = ticketno == null ? null : ticketno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.tickettitle
     *
     * @return the value of ticketinfo.tickettitle
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getTickettitle() {
        return tickettitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.tickettitle
     *
     * @param tickettitle the value for ticketinfo.tickettitle
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setTickettitle(String tickettitle) {
        this.tickettitle = tickettitle == null ? null : tickettitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.ticketscheduleid
     *
     * @return the value of ticketinfo.ticketscheduleid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Integer getTicketscheduleid() {
        return ticketscheduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.ticketscheduleid
     *
     * @param ticketscheduleid the value for ticketinfo.ticketscheduleid
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setTicketscheduleid(Integer ticketscheduleid) {
        this.ticketscheduleid = ticketscheduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.seatno
     *
     * @return the value of ticketinfo.seatno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getSeatno() {
        return seatno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.seatno
     *
     * @param seatno the value for ticketinfo.seatno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setSeatno(String seatno) {
        this.seatno = seatno == null ? null : seatno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.customername
     *
     * @return the value of ticketinfo.customername
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.customername
     *
     * @param customername the value for ticketinfo.customername
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.entrytime
     *
     * @return the value of ticketinfo.entrytime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.entrytime
     *
     * @param entrytime the value for ticketinfo.entrytime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.deadline
     *
     * @return the value of ticketinfo.deadline
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.deadline
     *
     * @param deadline the value for ticketinfo.deadline
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.checked
     *
     * @return the value of ticketinfo.checked
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Boolean getChecked() {
        return checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.checked
     *
     * @param checked the value for ticketinfo.checked
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.schedulename
     *
     * @return the value of ticketinfo.schedulename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getSchedulename() {
        return schedulename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.schedulename
     *
     * @param schedulename the value for ticketinfo.schedulename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setSchedulename(String schedulename) {
        this.schedulename = schedulename == null ? null : schedulename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.routename
     *
     * @return the value of ticketinfo.routename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getRoutename() {
        return routename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.routename
     *
     * @param routename the value for ticketinfo.routename
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setRoutename(String routename) {
        this.routename = routename == null ? null : routename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.startstationname
     *
     * @return the value of ticketinfo.startstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getStartstationname() {
        return startstationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.startstationname
     *
     * @param startstationname the value for ticketinfo.startstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setStartstationname(String startstationname) {
        this.startstationname = startstationname == null ? null : startstationname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.starttime
     *
     * @return the value of ticketinfo.starttime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.starttime
     *
     * @param starttime the value for ticketinfo.starttime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.endstationname
     *
     * @return the value of ticketinfo.endstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getEndstationname() {
        return endstationname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.endstationname
     *
     * @param endstationname the value for ticketinfo.endstationname
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setEndstationname(String endstationname) {
        this.endstationname = endstationname == null ? null : endstationname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.endtime
     *
     * @return the value of ticketinfo.endtime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.endtime
     *
     * @param endtime the value for ticketinfo.endtime
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ticketinfo.vehicleno
     *
     * @return the value of ticketinfo.vehicleno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getVehicleno() {
        return vehicleno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ticketinfo.vehicleno
     *
     * @param vehicleno the value for ticketinfo.vehicleno
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setVehicleno(String vehicleno) {
        this.vehicleno = vehicleno == null ? null : vehicleno.trim();
    }
}