package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import javax.persistence.*;

@Table(name = "t_role")
public class Role extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.remark
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String code;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.name
     *
     * @return the value of t_role.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.name
     *
     * @param name the value for t_role.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.remark
     *
     * @return the value of t_role.remark
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.remark
     *
     * @param remark the value for t_role.remark
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role.code
     *
     * @return the value of t_role.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role.code
     *
     * @param code the value for t_role.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setCode(String code) {
        this.code = code;
    }
}