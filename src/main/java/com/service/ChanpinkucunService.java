package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinkucunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinkucunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinkucunView;


/**
 * 产品库存
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinkucunService extends IService<ChanpinkucunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinkucunVO> selectListVO(Wrapper<ChanpinkucunEntity> wrapper);
   	
   	ChanpinkucunVO selectVO(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
   	
   	List<ChanpinkucunView> selectListView(Wrapper<ChanpinkucunEntity> wrapper);
   	
   	ChanpinkucunView selectView(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinkucunEntity> wrapper);
   	
}

