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
 * 产品入库
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
@TableName("chanpinruku")
public class ChanpinrukuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChanpinrukuEntity() {
		
	}
	
	public ChanpinrukuEntity(T t) {
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
	 * 产品名称
	 */
					
	private String chanpinmingcheng;
	
	/**
	 * 产品类型
	 */
					
	private String chanpinleixing;
	
	/**
	 * 供货厂家
	 */
					
	private String gonghuochangjia;
	
	/**
	 * 产品数量
	 */
					
	private Integer chanpinshuliang;
	
	/**
	 * 产品进价
	 */
					
	private Integer chanpinjinjia;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 摆放位置
	 */
					
	private String baifangweizhi;
	
	/**
	 * 入库日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date rukuriqi;
	
	
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
	 * 设置：产品名称
	 */
	public void setChanpinmingcheng(String chanpinmingcheng) {
		this.chanpinmingcheng = chanpinmingcheng;
	}
	/**
	 * 获取：产品名称
	 */
	public String getChanpinmingcheng() {
		return chanpinmingcheng;
	}
	/**
	 * 设置：产品类型
	 */
	public void setChanpinleixing(String chanpinleixing) {
		this.chanpinleixing = chanpinleixing;
	}
	/**
	 * 获取：产品类型
	 */
	public String getChanpinleixing() {
		return chanpinleixing;
	}
	/**
	 * 设置：供货厂家
	 */
	public void setGonghuochangjia(String gonghuochangjia) {
		this.gonghuochangjia = gonghuochangjia;
	}
	/**
	 * 获取：供货厂家
	 */
	public String getGonghuochangjia() {
		return gonghuochangjia;
	}
	/**
	 * 设置：产品数量
	 */
	public void setChanpinshuliang(Integer chanpinshuliang) {
		this.chanpinshuliang = chanpinshuliang;
	}
	/**
	 * 获取：产品数量
	 */
	public Integer getChanpinshuliang() {
		return chanpinshuliang;
	}
	/**
	 * 设置：产品进价
	 */
	public void setChanpinjinjia(Integer chanpinjinjia) {
		this.chanpinjinjia = chanpinjinjia;
	}
	/**
	 * 获取：产品进价
	 */
	public Integer getChanpinjinjia() {
		return chanpinjinjia;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：摆放位置
	 */
	public void setBaifangweizhi(String baifangweizhi) {
		this.baifangweizhi = baifangweizhi;
	}
	/**
	 * 获取：摆放位置
	 */
	public String getBaifangweizhi() {
		return baifangweizhi;
	}
	/**
	 * 设置：入库日期
	 */
	public void setRukuriqi(Date rukuriqi) {
		this.rukuriqi = rukuriqi;
	}
	/**
	 * 获取：入库日期
	 */
	public Date getRukuriqi() {
		return rukuriqi;
	}

}
