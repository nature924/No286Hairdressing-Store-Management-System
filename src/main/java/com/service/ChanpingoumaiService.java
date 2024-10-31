package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChanpingoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChanpingoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChanpingoumaiView;


/**
 * 产品购买
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpingoumaiService extends IService<ChanpingoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChanpingoumaiVO> selectListVO(Wrapper<ChanpingoumaiEntity> wrapper);
   	
   	ChanpingoumaiVO selectVO(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
   	
   	List<ChanpingoumaiView> selectListView(Wrapper<ChanpingoumaiEntity> wrapper);
   	
   	ChanpingoumaiView selectView(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChanpingoumaiEntity> wrapper);
   	
}

