package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanchongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanchongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanchongzhiView;


/**
 * 会员充值
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface HuiyuanchongzhiService extends IService<HuiyuanchongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanchongzhiVO> selectListVO(Wrapper<HuiyuanchongzhiEntity> wrapper);
   	
   	HuiyuanchongzhiVO selectVO(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
   	
   	List<HuiyuanchongzhiView> selectListView(Wrapper<HuiyuanchongzhiEntity> wrapper);
   	
   	HuiyuanchongzhiView selectView(@Param("ew") Wrapper<HuiyuanchongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanchongzhiEntity> wrapper);
   	
}

