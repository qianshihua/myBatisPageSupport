package com.ailk.system.dal.ibatis.model;

public class SysConfigKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.CFG_TYPE
     *
     * @mbggenerated
     */
    private String cfgType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_config.CFG_KEY
     *
     * @mbggenerated
     */
    private String cfgKey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.CFG_TYPE
     *
     * @return the value of sys_config.CFG_TYPE
     *
     * @mbggenerated
     */
    public String getCfgType() {
        return cfgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.CFG_TYPE
     *
     * @param cfgType the value for sys_config.CFG_TYPE
     *
     * @mbggenerated
     */
    public void setCfgType(String cfgType) {
        this.cfgType = cfgType == null ? null : cfgType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_config.CFG_KEY
     *
     * @return the value of sys_config.CFG_KEY
     *
     * @mbggenerated
     */
    public String getCfgKey() {
        return cfgKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_config.CFG_KEY
     *
     * @param cfgKey the value for sys_config.CFG_KEY
     *
     * @mbggenerated
     */
    public void setCfgKey(String cfgKey) {
        this.cfgKey = cfgKey == null ? null : cfgKey.trim();
    }
}