package com.hq.sid.entity.generate;

import java.io.Serializable;

public class TSidMercPicKey implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sid_merc_pic.CORE_ID
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    private Integer coreId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_sid_merc_pic.PIC
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    private String pic;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_sid_merc_pic
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sid_merc_pic.CORE_ID
     *
     * @return the value of t_sid_merc_pic.CORE_ID
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public Integer getCoreId() {
        return coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sid_merc_pic.CORE_ID
     *
     * @param coreId the value for t_sid_merc_pic.CORE_ID
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void setCoreId(Integer coreId) {
        this.coreId = coreId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_sid_merc_pic.PIC
     *
     * @return the value of t_sid_merc_pic.PIC
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public String getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_sid_merc_pic.PIC
     *
     * @param pic the value for t_sid_merc_pic.PIC
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    public void setPic(String pic) {
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_sid_merc_pic
     *
     * @mbg.generated Tue Feb 21 20:05:58 CST 2017
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coreId=").append(coreId);
        sb.append(", pic=").append(pic);
        sb.append("]");
        return sb.toString();
    }
}