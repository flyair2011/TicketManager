package kevin.tm.dao;

import java.util.List;

import kevin.tm.dao.model.AdminBean;
import kevin.tm.dao.model.StationBean;
import kevin.tm.dao.model.StationBeanExample;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface StationBeanMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int countByExample(StationBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int deleteByExample(StationBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int deleteByPrimaryKey(Integer stationid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int insert(StationBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int insertSelective(StationBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    List<StationBean> selectByExample(StationBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    StationBean selectByPrimaryKey(Integer stationid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int updateByExampleSelective(@Param("record") StationBean record,
	    @Param("example") StationBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int updateByExample(@Param("record") StationBean record,
	    @Param("example") StationBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int updateByPrimaryKeySelective(StationBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table Station
     * 
     * @mbggenerated Mon Mar 03 20:49:21 CST 2014
     */
    int updateByPrimaryKey(StationBean record);

    /**
     * 分页全查询
     * 
     * @param start
     *            开始位置，0开始
     * @param limit
     *            查询条数限制
     * @return
     */
    @Select("SELECT TOP(#{limit}) * FROM [Station] WHERE [StationId] NOT IN (SELECT TOP(#{start}) [StationId] FROM [Station])")
    List<AdminBean> selectByPage(@Param("start") int start,
	    @Param("limit") int limit);
}