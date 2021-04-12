package com.kaikeba.community.pojo;

import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;


@Table(name = "user")
public class User {
    @Id //设置主键
    @KeySql(useGeneratedKeys = true)//设置主键回显
    private Integer uid;


    private String  uname;
    private String account_id;
    private String token;
    private Long gmt_creat;
    private Long gmt_modified;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Long getGmt_creat() {
        return gmt_creat;
    }

    public void setGmt_creat(Long gmt_creat) {
        this.gmt_creat = gmt_creat;
    }

    public Long getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Long gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", account_id='" + account_id + '\'' +
                ", token='" + token + '\'' +
                ", gmt_creat=" + gmt_creat +
                ", gmt_modified=" + gmt_modified +
                '}';
    }
}
