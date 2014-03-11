package kevin.tm.dao;

import java.util.List;

import kevin.tm.dao.model.BusBean;
import kevin.tm.dao.model.BusBeanExample;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface BusBeanMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int countByExample(BusBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int deleteByExample(BusBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int deleteByPrimaryKey(Integer busid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insert(BusBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insertSelective(BusBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    List<BusBean> selectByExample(BusBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    BusBean selectByPrimaryKey(Integer busid);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExampleSelective(@Param("record") BusBean record,
	    @Param("example") BusBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExample(@Param("record") BusBean record,
	    @Param("example") BusBeanExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByPrimaryKeySelective(BusBean record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds
     * to the database table bus
     * 
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByPrimaryKey(BusBean record);

    @Select("select * from bus")
    List<BusBean> selectByPage(RowBounds rowBounds);
}