package com.entity.view;

import com.entity.XiangmuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 项目类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
@TableName("xiangmuleixing")
public class XiangmuleixingView  extends XiangmuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiangmuleixingView(){
	}
 
 	public XiangmuleixingView(XiangmuleixingEntity xiangmuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, xiangmuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
