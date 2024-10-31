package com.entity.model;

import com.entity.YuechaxunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 余额查询
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public class YuechaxunModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
