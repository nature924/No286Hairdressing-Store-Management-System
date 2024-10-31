package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuleixingView;


/**
 * 项目类型
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface XiangmuleixingService extends IService<XiangmuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuleixingVO> selectListVO(Wrapper<XiangmuleixingEntity> wrapper);
   	
   	XiangmuleixingVO selectVO(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
   	
   	List<XiangmuleixingView> selectListView(Wrapper<XiangmuleixingEntity> wrapper);
   	
   	XiangmuleixingView selectView(@Param("ew") Wrapper<XiangmuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuleixingEntity> wrapper);
   	
}

