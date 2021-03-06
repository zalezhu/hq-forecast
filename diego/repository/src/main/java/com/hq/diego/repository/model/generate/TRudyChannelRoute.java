package com.hq.diego.repository.model.generate;

import java.io.Serializable;
import java.math.BigDecimal;

public class TRudyChannelRoute implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.id
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.name
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String channel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.pay_channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private Integer payChannel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.trade_type
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String tradeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.cost_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private BigDecimal costRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.guiding_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private BigDecimal guidingRate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.state
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.trade_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String tradeService;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.query_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String queryService;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.cancel_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private String cancelService;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_rudy_channel_route.priority
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private Integer priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.id
     *
     * @return the value of t_rudy_channel_route.id
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.id
     *
     * @param id the value for t_rudy_channel_route.id
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.name
     *
     * @return the value of t_rudy_channel_route.name
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.name
     *
     * @param name the value for t_rudy_channel_route.name
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.channel
     *
     * @return the value of t_rudy_channel_route.channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.channel
     *
     * @param channel the value for t_rudy_channel_route.channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.pay_channel
     *
     * @return the value of t_rudy_channel_route.pay_channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public Integer getPayChannel() {
        return payChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.pay_channel
     *
     * @param payChannel the value for t_rudy_channel_route.pay_channel
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.trade_type
     *
     * @return the value of t_rudy_channel_route.trade_type
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.trade_type
     *
     * @param tradeType the value for t_rudy_channel_route.trade_type
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.cost_rate
     *
     * @return the value of t_rudy_channel_route.cost_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public BigDecimal getCostRate() {
        return costRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.cost_rate
     *
     * @param costRate the value for t_rudy_channel_route.cost_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setCostRate(BigDecimal costRate) {
        this.costRate = costRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.guiding_rate
     *
     * @return the value of t_rudy_channel_route.guiding_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public BigDecimal getGuidingRate() {
        return guidingRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.guiding_rate
     *
     * @param guidingRate the value for t_rudy_channel_route.guiding_rate
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setGuidingRate(BigDecimal guidingRate) {
        this.guidingRate = guidingRate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.state
     *
     * @return the value of t_rudy_channel_route.state
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.state
     *
     * @param state the value for t_rudy_channel_route.state
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.trade_service
     *
     * @return the value of t_rudy_channel_route.trade_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getTradeService() {
        return tradeService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.trade_service
     *
     * @param tradeService the value for t_rudy_channel_route.trade_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setTradeService(String tradeService) {
        this.tradeService = tradeService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.query_service
     *
     * @return the value of t_rudy_channel_route.query_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getQueryService() {
        return queryService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.query_service
     *
     * @param queryService the value for t_rudy_channel_route.query_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setQueryService(String queryService) {
        this.queryService = queryService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.cancel_service
     *
     * @return the value of t_rudy_channel_route.cancel_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public String getCancelService() {
        return cancelService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.cancel_service
     *
     * @param cancelService the value for t_rudy_channel_route.cancel_service
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setCancelService(String cancelService) {
        this.cancelService = cancelService;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_rudy_channel_route.priority
     *
     * @return the value of t_rudy_channel_route.priority
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public Integer getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_rudy_channel_route.priority
     *
     * @param priority the value for t_rudy_channel_route.priority
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rudy_channel_route
     *
     * @mbg.generated Wed Mar 22 18:29:43 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", channel=").append(channel);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", tradeType=").append(tradeType);
        sb.append(", costRate=").append(costRate);
        sb.append(", guidingRate=").append(guidingRate);
        sb.append(", state=").append(state);
        sb.append(", tradeService=").append(tradeService);
        sb.append(", queryService=").append(queryService);
        sb.append(", cancelService=").append(cancelService);
        sb.append(", priority=").append(priority);
        sb.append("]");
        return sb.toString();
    }
}