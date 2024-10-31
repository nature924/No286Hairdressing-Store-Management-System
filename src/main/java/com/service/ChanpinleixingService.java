package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinleixingView;


/**
 * 产品类型
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinleixingService extends IService<ChanpinleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinleixingVO> selectListVO(Wrapper<ChanpinleixingEntity> wrapper);
   	
   	ChanpinleixingVO selectVO(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
   	
   	List<ChanpinleixingView> selectListView(Wrapper<ChanpinleixingEntity> wrapper);
   	
   	ChanpinleixingView selectView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinleixingEntity> wrapper);
   	
}

