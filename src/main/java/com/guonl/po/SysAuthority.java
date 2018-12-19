package com.guonl.po;

public class SysAuthority {
    private Long id;

    private String dataUrl;

    private String menuClass;

    private String menuCode;

    private String menuName;

    private String parentMenucode;

    private Long sequence;

    private String menuType;

    private String createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl == null ? null : dataUrl.trim();
    }

    public String getMenuClass() {
        return menuClass;
    }

    public void setMenuClass(String menuClass) {
        this.menuClass = menuClass == null ? null : menuClass.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getParentMenucode() {
        return parentMenucode;
    }

    public void setParentMenucode(String parentMenucode) {
        this.parentMenucode = parentMenucode == null ? null : parentMenucode.trim();
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static SysAuthority.Builder builder() {
        return new SysAuthority.Builder();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public static class Builder {
        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private SysAuthority obj;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder() {
            this.obj = new SysAuthority();
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.id
         *
         * @param id the value for sys_authority.id
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder id(Long id) {
            obj.setId(id);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.data_url
         *
         * @param dataUrl the value for sys_authority.data_url
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder dataUrl(String dataUrl) {
            obj.setDataUrl(dataUrl);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.menu_class
         *
         * @param menuClass the value for sys_authority.menu_class
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder menuClass(String menuClass) {
            obj.setMenuClass(menuClass);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.menu_code
         *
         * @param menuCode the value for sys_authority.menu_code
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder menuCode(String menuCode) {
            obj.setMenuCode(menuCode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.menu_name
         *
         * @param menuName the value for sys_authority.menu_name
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder menuName(String menuName) {
            obj.setMenuName(menuName);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.parent_menucode
         *
         * @param parentMenucode the value for sys_authority.parent_menucode
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder parentMenucode(String parentMenucode) {
            obj.setParentMenucode(parentMenucode);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.sequence
         *
         * @param sequence the value for sys_authority.sequence
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder sequence(Long sequence) {
            obj.setSequence(sequence);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.menu_type
         *
         * @param menuType the value for sys_authority.menu_type
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder menuType(String menuType) {
            obj.setMenuType(menuType);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method sets the value of the database column sys_authority.create_time
         *
         * @param createTime the value for sys_authority.create_time
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public Builder createTime(String createTime) {
            obj.setCreateTime(createTime);
            return this;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public SysAuthority build() {
            return this.obj;
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table sys_authority
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        id("id"),
        dataUrl("data_url"),
        menuClass("menu_class"),
        menuCode("menu_code"),
        menuName("menu_name"),
        parentMenucode("parent_menucode"),
        sequence("sequence"),
        menuType("menu_type"),
        createTime("create_time");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table sys_authority
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}