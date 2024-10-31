package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 余额查询
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
@TableName("yuechaxun")
public class YuechaxunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuechaxunEntity() {
		
	}
	
	public YuechaxunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 会员卡号
	 */
					
	private String huiyuankahao;
	
	/**
	 * 会员类型
	 */
					
	private String huiyuanleixing;
	
	/**
	 * 会员等级
	 */
					
	private Integer huiyuandengji;
	
	/**
	 * 办理日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date banliriqi;
	
	/**
	 * 使用时间
	 */
					
	private String shiyongshijian;
	
	/**
	 * 会员余额
	 */
					
	private Integer huiyuanyue;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：会员卡号
	 */
	public void setHuiyuankahao(String huiyuankahao) {
		this.huiyuankahao = huiyuankahao;
	}
	/**
	 * 获取：会员卡号
	 */
	public String getHuiyuankahao() {
		return huiyuankahao;
	}
	/**
	 * 设置：会员类型
	 */
	public void setHuiyuanleixing(String huiyuanleixing) {
		this.huiyuanleixing = huiyuanleixing;
	}
	/**
	 * 获取：会员类型
	 */
	public String getHuiyuanleixing() {
		return huiyuanleixing;
	}
	/**
	 * 设置：会员等级
	 */
	public void setHuiyuandengji(Integer huiyuandengji) {
		this.huiyuandengji = huiyuandengji;
	}
	/**
	 * 获取：会员等级
	 */
	public Integer getHuiyuandengji() {
		return huiyuandengji;
	}
	/**
	 * 设置：办理日期
	 */
	public void setBanliriqi(Date banliriqi) {
		this.banliriqi = banliriqi;
	}
	/**
	 * 获取：办理日期
	 */
	public Date getBanliriqi() {
		return banliriqi;
	}
	/**
	 * 设置：使用时间
	 */
	public void setShiyongshijian(String shiyongshijian) {
		this.shiyongshijian = shiyongshijian;
	}
	/**
	 * 获取：使用时间
	 */
	public String getShiyongshijian() {
		return shiyongshijian;
	}
	/**
	 * 设置：会员余额
	 */
	public void setHuiyuanyue(Integer huiyuanyue) {
		this.huiyuanyue = huiyuanyue;
	}
	/**
	 * 获取：会员余额
	 */
	public Integer getHuiyuanyue() {
		return huiyuanyue;
	}

}
