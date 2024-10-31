package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpinrukuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpinrukuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpinrukuView;


/**
 * 产品入库
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinrukuService extends IService<ChanpinrukuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpinrukuVO> selectListVO(Wrapper<ChanpinrukuEntity> wrapper);
   	
   	ChanpinrukuVO selectVO(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
   	
   	List<ChanpinrukuView> selectListView(Wrapper<ChanpinrukuEntity> wrapper);
   	
   	ChanpinrukuView selectView(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpinrukuEntity> wrapper);
   	
}

