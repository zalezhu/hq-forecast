package com.hq.flood.entity.generate;

import java.io.Serializable;
import java.util.Date;

public class TFloodRoleResource extends TFloodRoleResourceKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flood_role_resource.CREATE_TIME
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_flood_role_resource.CREATE_USER_ID
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    private String createUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_flood_role_resource
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flood_role_resource.CREATE_TIME
     *
     * @return the value of t_flood_role_resource.CREATE_TIME
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flood_role_resource.CREATE_TIME
     *
     * @param createTime the value for t_flood_role_resource.CREATE_TIME
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_flood_role_resource.CREATE_USER_ID
     *
     * @return the value of t_flood_role_resource.CREATE_USER_ID
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public String getCreateUserId() {
        return createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_flood_role_resource.CREATE_USER_ID
     *
     * @param createUserId the value for t_flood_role_resource.CREATE_USER_ID
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_flood_role_resource
     *
     * @mbg.generated Wed Feb 15 23:13:34 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", createTime=").append(createTime);
        sb.append(", createUserId=").append(createUserId);
        sb.append("]");
        return sb.toString();
    }
}