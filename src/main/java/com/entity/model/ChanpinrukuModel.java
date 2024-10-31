package com.entity.model;

import com.entity.ChanpinrukuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 产品入库
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public class ChanpinrukuModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date rukuriqi;
				
	
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
