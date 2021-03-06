package com.hq.soto.entity.generate;

import java.io.Serializable;
import java.util.Date;

public class TSotoFeeTemplateCore implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_template_core.CORE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Integer coreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_template_core.TEMPLATE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Integer templateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_soto_fee_template_core.VALID_DATE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private Date validDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_soto_fee_template_core
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_template_core.CORE_ID
     *
     * @return the value of t_soto_fee_template_core.CORE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Integer getCoreId() {
        return coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_template_core.CORE_ID
     *
     * @param coreId the value for t_soto_fee_template_core.CORE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setCoreId(Integer coreId) {
        this.coreId = coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_template_core.TEMPLATE_ID
     *
     * @return the value of t_soto_fee_template_core.TEMPLATE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_template_core.TEMPLATE_ID
     *
     * @param templateId the value for t_soto_fee_template_core.TEMPLATE_ID
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_soto_fee_template_core.VALID_DATE
     *
     * @return the value of t_soto_fee_template_core.VALID_DATE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public Date getValidDate() {
        return validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_soto_fee_template_core.VALID_DATE
     *
     * @param validDate the value for t_soto_fee_template_core.VALID_DATE
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    public void setValidDate(Date validDate) {
        this.validDate = validDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_soto_fee_template_core
     *
     * @mbg.generated Wed Mar 08 00:13:38 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coreId=").append(coreId);
        sb.append(", templateId=").append(templateId);
        sb.append(", validDate=").append(validDate);
        sb.append("]");
        return sb.toString();
    }
}