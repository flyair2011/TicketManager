package kevin.tm.dao;

import java.util.List;

import kevin.tm.dao.model.RouteBean;
import kevin.tm.dao.model.RouteBeanExample;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface RouteBeanMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int countByExample(RouteBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int deleteByExample(RouteBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int deleteByPrimaryKey(Integer routeid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insert(RouteBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insertSelective(RouteBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    List<RouteBean> selectByExample(RouteBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    RouteBean selectByPrimaryKey(Integer routeid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExampleSelective(@Param("record") RouteBean record,
	    @Param("example") RouteBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExample(@Param("record") RouteBean record,
	    @Param("example") RouteBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByPrimaryKeySelective(RouteBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table route
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByPrimaryKey(RouteBean record);

    @Select("select * from route")
    List<RouteBean> selectByPage(RowBounds rowBounds);
}