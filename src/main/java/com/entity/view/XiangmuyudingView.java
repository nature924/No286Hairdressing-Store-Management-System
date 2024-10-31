package com.entity.view;

import com.entity.XiangmuyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目预定
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
@TableName("xiangmuyuding")
public class XiangmuyudingView  extends XiangmuyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmuyudingView(){
	}
 
 	public XiangmuyudingView(XiangmuyudingEntity xiangmuyudingEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmuyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
