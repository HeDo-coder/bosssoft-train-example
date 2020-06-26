package com.bosssoft.hr.train.springboot.basic.example.pojo.entity;

import javax.persistence.*;

@Table(name = "t_company")
public class Company extends BaseEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.mnemonic_code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String mnemonicCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.master
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String master;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.tax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String tax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.fax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String fax;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.tel
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.email
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.website
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    private String website;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.name
     *
     * @return the value of t_company.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.name
     *
     * @param name the value for t_company.name
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.code
     *
     * @return the value of t_company.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.code
     *
     * @param code the value for t_company.code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.mnemonic_code
     *
     * @return the value of t_company.mnemonic_code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getMnemonicCode() {
        return mnemonicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.mnemonic_code
     *
     * @param mnemonicCode the value for t_company.mnemonic_code
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.master
     *
     * @return the value of t_company.master
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getMaster() {
        return master;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.master
     *
     * @param master the value for t_company.master
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setMaster(String master) {
        this.master = master;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.tax
     *
     * @return the value of t_company.tax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getTax() {
        return tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.tax
     *
     * @param tax the value for t_company.tax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setTax(String tax) {
        this.tax = tax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.fax
     *
     * @return the value of t_company.fax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getFax() {
        return fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.fax
     *
     * @param fax the value for t_company.fax
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.tel
     *
     * @return the value of t_company.tel
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.tel
     *
     * @param tel the value for t_company.tel
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.email
     *
     * @return the value of t_company.email
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.email
     *
     * @param email the value for t_company.email
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_company.website
     *
     * @return the value of t_company.website
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public String getWebsite() {
        return website;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_company.website
     *
     * @param website the value for t_company.website
     *
     * @mbg.generated Thu Jun 25 14:51:09 CST 2020
     */
    public void setWebsite(String website) {
        this.website = website;
    }
}