package com.hq.soto.entity.generate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TSotoFeeInfo extends TSotoFeeInfoKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private BigDecimal fee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.DIS_FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private BigDecimal disFee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.CRT_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Integer crtOperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.CRT_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Date crtTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.MDF_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Integer mdfOperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_info.MDF_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Date mdfTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_soto_fee_info
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.FEE
     *
     * @return the value of t_soto_fee_info.FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.FEE
     *
     * @param fee the value for t_soto_fee_info.FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.DIS_FEE
     *
     * @return the value of t_soto_fee_info.DIS_FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public BigDecimal getDisFee() {
        return disFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.DIS_FEE
     *
     * @param disFee the value for t_soto_fee_info.DIS_FEE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setDisFee(BigDecimal disFee) {
        this.disFee = disFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.CRT_OPER_ID
     *
     * @return the value of t_soto_fee_info.CRT_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Integer getCrtOperId() {
        return crtOperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.CRT_OPER_ID
     *
     * @param crtOperId the value for t_soto_fee_info.CRT_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setCrtOperId(Integer crtOperId) {
        this.crtOperId = crtOperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.CRT_TIME
     *
     * @return the value of t_soto_fee_info.CRT_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Date getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.CRT_TIME
     *
     * @param crtTime the value for t_soto_fee_info.CRT_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.MDF_OPER_ID
     *
     * @return the value of t_soto_fee_info.MDF_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Integer getMdfOperId() {
        return mdfOperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.MDF_OPER_ID
     *
     * @param mdfOperId the value for t_soto_fee_info.MDF_OPER_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setMdfOperId(Integer mdfOperId) {
        this.mdfOperId = mdfOperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_info.MDF_TIME
     *
     * @return the value of t_soto_fee_info.MDF_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Date getMdfTime() {
        return mdfTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_info.MDF_TIME
     *
     * @param mdfTime the value for t_soto_fee_info.MDF_TIME
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setMdfTime(Date mdfTime) {
        this.mdfTime = mdfTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_soto_fee_info
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fee=").append(fee);
        sb.append(", disFee=").append(disFee);
        sb.append(", crtOperId=").append(crtOperId);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", mdfOperId=").append(mdfOperId);
        sb.append(", mdfTime=").append(mdfTime);
        sb.append("]");
        return sb.toString();
    }
}