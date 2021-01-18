package com.text.park.entity;

import java.util.Date;

/**
*
* @Author:sky
* @Date: 2021/1/18 17:49
*/
public class User {
    private String id;

    /**
    * 手机号不能重复
    */
    private String mobile;

    /**
    * 昵称
    */
    private String nickname;

    private String password;

    /**
    * 用户的头像
    */
    private String headImgUrl;

    private Date birthday;

    /**
    * 真实姓名
    */
    private String realname;

    /**
    * 用户的所在地址(注册用户通过添加的地址匹配加盟商)  未注册用户通过定位获取j加盟商
    */
    private String address;

    /**
    * 省份，微信获取用户信息的时候拿到的，在排行榜的时候会用到
    */
    private String province;

    /**
    * 工作单位
    */
    private String workPlace;

    /**
    * 0没被禁用1被禁用
    */
    private Integer isdisabled;

    private String sex;

    /**
    * 微信的openID
    */
    private String openId;

    /**
    * 积分(积分可用于兑换，20积分 == 1元)
    */
    private Integer integral;

    /**
    * 连续签到天数
    */
    private Integer insistCount;

    /**
    * 我加入的小组的ID，为空代表未加入小组
    */
    private String teamId;

    /**
    * 自加入小组以来的做题总数(目前是仅统计每日一练的)
    */
    private Integer teamExerciseCount;

    /**
    * 毕业院校
    */
    private String school;

    /**
    * 部门、科室
    */
    private String department;

    /**
    * 注册时间
    */
    private Date addtime;

    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadImgUrl() {
        return headImgUrl;
    }

    public void setHeadImgUrl(String headImgUrl) {
        this.headImgUrl = headImgUrl;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public Integer getIsdisabled() {
        return isdisabled;
    }

    public void setIsdisabled(Integer isdisabled) {
        this.isdisabled = isdisabled;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getInsistCount() {
        return insistCount;
    }

    public void setInsistCount(Integer insistCount) {
        this.insistCount = insistCount;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Integer getTeamExerciseCount() {
        return teamExerciseCount;
    }

    public void setTeamExerciseCount(Integer teamExerciseCount) {
        this.teamExerciseCount = teamExerciseCount;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}