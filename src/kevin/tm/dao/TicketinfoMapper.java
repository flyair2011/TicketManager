package kevin.tm.dao;

import java.util.List;
import kevin.tm.dao.model.Ticketinfo;
import kevin.tm.dao.model.TicketinfoExample;
import org.apache.ibatis.annotations.Param;

public interface TicketinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int countByExample(TicketinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int deleteByExample(TicketinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insert(Ticketinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int insertSelective(Ticketinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    List<Ticketinfo> selectByExample(TicketinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExampleSelective(@Param("record") Ticketinfo record, @Param("example") TicketinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ticketinfo
     *
     * @mbggenerated Tue Mar 11 14:47:47 CST 2014
     */
    int updateByExample(@Param("record") Ticketinfo record, @Param("example") TicketinfoExample example);
}