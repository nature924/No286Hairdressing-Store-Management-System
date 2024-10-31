package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusschanpinkucunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusschanpinkucunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusschanpinkucunView;


/**
 * 产品库存评论表
 *
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface DiscusschanpinkucunService extends IService<DiscusschanpinkucunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusschanpinkucunVO> selectListVO(Wrapper<DiscusschanpinkucunEntity> wrapper);
   	
   	DiscusschanpinkucunVO selectVO(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
   	
   	List<DiscusschanpinkucunView> selectListView(Wrapper<DiscusschanpinkucunEntity> wrapper);
   	
   	DiscusschanpinkucunView selectView(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusschanpinkucunEntity> wrapper);
   	
}

