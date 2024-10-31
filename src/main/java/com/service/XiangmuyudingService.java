package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuyudingView;


/**
 * 项目预定
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface XiangmuyudingService extends IService<XiangmuyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuyudingVO> selectListVO(Wrapper<XiangmuyudingEntity> wrapper);
   	
   	XiangmuyudingVO selectVO(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
   	
   	List<XiangmuyudingView> selectListView(Wrapper<XiangmuyudingEntity> wrapper);
   	
   	XiangmuyudingView selectView(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuyudingEntity> wrapper);
   	
}

