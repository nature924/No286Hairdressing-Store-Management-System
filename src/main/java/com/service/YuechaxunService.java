package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuechaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuechaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuechaxunView;


/**
 * 余额查询
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface YuechaxunService extends IService<YuechaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuechaxunVO> selectListVO(Wrapper<YuechaxunEntity> wrapper);
   	
   	YuechaxunVO selectVO(@Param("ew") Wrapper<YuechaxunEntity> wrapper);
   	
   	List<YuechaxunView> selectListView(Wrapper<YuechaxunEntity> wrapper);
   	
   	YuechaxunView selectView(@Param("ew") Wrapper<YuechaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuechaxunEntity> wrapper);
   	
}

