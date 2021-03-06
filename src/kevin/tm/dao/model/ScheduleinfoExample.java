package kevin.tm.dao.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public ScheduleinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andScheduleidIsNull() {
            addCriterion("scheduleid is null");
            return (Criteria) this;
        }

        public Criteria andScheduleidIsNotNull() {
            addCriterion("scheduleid is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleidEqualTo(Integer value) {
            addCriterion("scheduleid =", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotEqualTo(Integer value) {
            addCriterion("scheduleid <>", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThan(Integer value) {
            addCriterion("scheduleid >", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("scheduleid >=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThan(Integer value) {
            addCriterion("scheduleid <", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidLessThanOrEqualTo(Integer value) {
            addCriterion("scheduleid <=", value, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidIn(List<Integer> values) {
            addCriterion("scheduleid in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotIn(List<Integer> values) {
            addCriterion("scheduleid not in", values, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidBetween(Integer value1, Integer value2) {
            addCriterion("scheduleid between", value1, value2, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andScheduleidNotBetween(Integer value1, Integer value2) {
            addCriterion("scheduleid not between", value1, value2, "scheduleid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidIsNull() {
            addCriterion("schedulerouteid is null");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidIsNotNull() {
            addCriterion("schedulerouteid is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidEqualTo(Integer value) {
            addCriterion("schedulerouteid =", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidNotEqualTo(Integer value) {
            addCriterion("schedulerouteid <>", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidGreaterThan(Integer value) {
            addCriterion("schedulerouteid >", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedulerouteid >=", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidLessThan(Integer value) {
            addCriterion("schedulerouteid <", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidLessThanOrEqualTo(Integer value) {
            addCriterion("schedulerouteid <=", value, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidIn(List<Integer> values) {
            addCriterion("schedulerouteid in", values, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidNotIn(List<Integer> values) {
            addCriterion("schedulerouteid not in", values, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidBetween(Integer value1, Integer value2) {
            addCriterion("schedulerouteid between", value1, value2, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulerouteidNotBetween(Integer value1, Integer value2) {
            addCriterion("schedulerouteid not between", value1, value2, "schedulerouteid");
            return (Criteria) this;
        }

        public Criteria andSchedulenameIsNull() {
            addCriterion("schedulename is null");
            return (Criteria) this;
        }

        public Criteria andSchedulenameIsNotNull() {
            addCriterion("schedulename is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulenameEqualTo(String value) {
            addCriterion("schedulename =", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameNotEqualTo(String value) {
            addCriterion("schedulename <>", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameGreaterThan(String value) {
            addCriterion("schedulename >", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameGreaterThanOrEqualTo(String value) {
            addCriterion("schedulename >=", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameLessThan(String value) {
            addCriterion("schedulename <", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameLessThanOrEqualTo(String value) {
            addCriterion("schedulename <=", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameLike(String value) {
            addCriterion("schedulename like", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameNotLike(String value) {
            addCriterion("schedulename not like", value, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameIn(List<String> values) {
            addCriterion("schedulename in", values, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameNotIn(List<String> values) {
            addCriterion("schedulename not in", values, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameBetween(String value1, String value2) {
            addCriterion("schedulename between", value1, value2, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulenameNotBetween(String value1, String value2) {
            addCriterion("schedulename not between", value1, value2, "schedulename");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidIsNull() {
            addCriterion("schedulebusid is null");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidIsNotNull() {
            addCriterion("schedulebusid is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidEqualTo(Integer value) {
            addCriterion("schedulebusid =", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidNotEqualTo(Integer value) {
            addCriterion("schedulebusid <>", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidGreaterThan(Integer value) {
            addCriterion("schedulebusid >", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidGreaterThanOrEqualTo(Integer value) {
            addCriterion("schedulebusid >=", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidLessThan(Integer value) {
            addCriterion("schedulebusid <", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidLessThanOrEqualTo(Integer value) {
            addCriterion("schedulebusid <=", value, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidIn(List<Integer> values) {
            addCriterion("schedulebusid in", values, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidNotIn(List<Integer> values) {
            addCriterion("schedulebusid not in", values, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidBetween(Integer value1, Integer value2) {
            addCriterion("schedulebusid between", value1, value2, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andSchedulebusidNotBetween(Integer value1, Integer value2) {
            addCriterion("schedulebusid not between", value1, value2, "schedulebusid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("starttime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("starttime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("starttime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("starttime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("starttime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("starttime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("starttime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("starttime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("starttime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("starttime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("starttime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("starttime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRoutenameIsNull() {
            addCriterion("routename is null");
            return (Criteria) this;
        }

        public Criteria andRoutenameIsNotNull() {
            addCriterion("routename is not null");
            return (Criteria) this;
        }

        public Criteria andRoutenameEqualTo(String value) {
            addCriterion("routename =", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotEqualTo(String value) {
            addCriterion("routename <>", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameGreaterThan(String value) {
            addCriterion("routename >", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameGreaterThanOrEqualTo(String value) {
            addCriterion("routename >=", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLessThan(String value) {
            addCriterion("routename <", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLessThanOrEqualTo(String value) {
            addCriterion("routename <=", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameLike(String value) {
            addCriterion("routename like", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotLike(String value) {
            addCriterion("routename not like", value, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameIn(List<String> values) {
            addCriterion("routename in", values, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotIn(List<String> values) {
            addCriterion("routename not in", values, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameBetween(String value1, String value2) {
            addCriterion("routename between", value1, value2, "routename");
            return (Criteria) this;
        }

        public Criteria andRoutenameNotBetween(String value1, String value2) {
            addCriterion("routename not between", value1, value2, "routename");
            return (Criteria) this;
        }

        public Criteria andStartstationnameIsNull() {
            addCriterion("startstationname is null");
            return (Criteria) this;
        }

        public Criteria andStartstationnameIsNotNull() {
            addCriterion("startstationname is not null");
            return (Criteria) this;
        }

        public Criteria andStartstationnameEqualTo(String value) {
            addCriterion("startstationname =", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameNotEqualTo(String value) {
            addCriterion("startstationname <>", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameGreaterThan(String value) {
            addCriterion("startstationname >", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameGreaterThanOrEqualTo(String value) {
            addCriterion("startstationname >=", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameLessThan(String value) {
            addCriterion("startstationname <", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameLessThanOrEqualTo(String value) {
            addCriterion("startstationname <=", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameLike(String value) {
            addCriterion("startstationname like", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameNotLike(String value) {
            addCriterion("startstationname not like", value, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameIn(List<String> values) {
            addCriterion("startstationname in", values, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameNotIn(List<String> values) {
            addCriterion("startstationname not in", values, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameBetween(String value1, String value2) {
            addCriterion("startstationname between", value1, value2, "startstationname");
            return (Criteria) this;
        }

        public Criteria andStartstationnameNotBetween(String value1, String value2) {
            addCriterion("startstationname not between", value1, value2, "startstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameIsNull() {
            addCriterion("endstationname is null");
            return (Criteria) this;
        }

        public Criteria andEndstationnameIsNotNull() {
            addCriterion("endstationname is not null");
            return (Criteria) this;
        }

        public Criteria andEndstationnameEqualTo(String value) {
            addCriterion("endstationname =", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameNotEqualTo(String value) {
            addCriterion("endstationname <>", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameGreaterThan(String value) {
            addCriterion("endstationname >", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameGreaterThanOrEqualTo(String value) {
            addCriterion("endstationname >=", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameLessThan(String value) {
            addCriterion("endstationname <", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameLessThanOrEqualTo(String value) {
            addCriterion("endstationname <=", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameLike(String value) {
            addCriterion("endstationname like", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameNotLike(String value) {
            addCriterion("endstationname not like", value, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameIn(List<String> values) {
            addCriterion("endstationname in", values, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameNotIn(List<String> values) {
            addCriterion("endstationname not in", values, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameBetween(String value1, String value2) {
            addCriterion("endstationname between", value1, value2, "endstationname");
            return (Criteria) this;
        }

        public Criteria andEndstationnameNotBetween(String value1, String value2) {
            addCriterion("endstationname not between", value1, value2, "endstationname");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNull() {
            addCriterion("vehicleno is null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIsNotNull() {
            addCriterion("vehicleno is not null");
            return (Criteria) this;
        }

        public Criteria andVehiclenoEqualTo(String value) {
            addCriterion("vehicleno =", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotEqualTo(String value) {
            addCriterion("vehicleno <>", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThan(String value) {
            addCriterion("vehicleno >", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoGreaterThanOrEqualTo(String value) {
            addCriterion("vehicleno >=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThan(String value) {
            addCriterion("vehicleno <", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLessThanOrEqualTo(String value) {
            addCriterion("vehicleno <=", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoLike(String value) {
            addCriterion("vehicleno like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotLike(String value) {
            addCriterion("vehicleno not like", value, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoIn(List<String> values) {
            addCriterion("vehicleno in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotIn(List<String> values) {
            addCriterion("vehicleno not in", values, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoBetween(String value1, String value2) {
            addCriterion("vehicleno between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andVehiclenoNotBetween(String value1, String value2) {
            addCriterion("vehicleno not between", value1, value2, "vehicleno");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNull() {
            addCriterion("drivername is null");
            return (Criteria) this;
        }

        public Criteria andDrivernameIsNotNull() {
            addCriterion("drivername is not null");
            return (Criteria) this;
        }

        public Criteria andDrivernameEqualTo(String value) {
            addCriterion("drivername =", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotEqualTo(String value) {
            addCriterion("drivername <>", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThan(String value) {
            addCriterion("drivername >", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameGreaterThanOrEqualTo(String value) {
            addCriterion("drivername >=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThan(String value) {
            addCriterion("drivername <", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLessThanOrEqualTo(String value) {
            addCriterion("drivername <=", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameLike(String value) {
            addCriterion("drivername like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotLike(String value) {
            addCriterion("drivername not like", value, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameIn(List<String> values) {
            addCriterion("drivername in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotIn(List<String> values) {
            addCriterion("drivername not in", values, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameBetween(String value1, String value2) {
            addCriterion("drivername between", value1, value2, "drivername");
            return (Criteria) this;
        }

        public Criteria andDrivernameNotBetween(String value1, String value2) {
            addCriterion("drivername not between", value1, value2, "drivername");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduleinfo
     *
     * @mbggenerated do_not_delete_during_merge Tue Mar 11 14:47:47 CST 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table scheduleinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}