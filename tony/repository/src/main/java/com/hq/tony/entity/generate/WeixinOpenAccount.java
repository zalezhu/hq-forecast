package com.hq.tony.entity.generate;

import java.io.Serializable;
import java.util.Date;

public class WeixinOpenAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_open_account.id
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_open_account.appid
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    private String appid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_open_account.ticket
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    private String ticket;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column weixin_open_account.get_ticket_time
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    private Date getTicketTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table weixin_open_account
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_open_account.id
     *
     * @return the value of weixin_open_account.id
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_open_account.id
     *
     * @param id the value for weixin_open_account.id
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_open_account.appid
     *
     * @return the value of weixin_open_account.appid
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_open_account.appid
     *
     * @param appid the value for weixin_open_account.appid
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_open_account.ticket
     *
     * @return the value of weixin_open_account.ticket
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public String getTicket() {
        return ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_open_account.ticket
     *
     * @param ticket the value for weixin_open_account.ticket
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column weixin_open_account.get_ticket_time
     *
     * @return the value of weixin_open_account.get_ticket_time
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public Date getGetTicketTime() {
        return getTicketTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column weixin_open_account.get_ticket_time
     *
     * @param getTicketTime the value for weixin_open_account.get_ticket_time
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    public void setGetTicketTime(Date getTicketTime) {
        this.getTicketTime = getTicketTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table weixin_open_account
     *
     * @mbg.generated Sat Mar 04 11:19:50 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", appid=").append(appid);
        sb.append(", ticket=").append(ticket);
        sb.append(", getTicketTime=").append(getTicketTime);
        sb.append("]");
        return sb.toString();
    }
}