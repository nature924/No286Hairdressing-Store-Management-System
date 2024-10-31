package com.dao;

import com.entity.DiscusschanpinkucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusschanpinkucunVO;
import com.entity.view.DiscusschanpinkucunView;


/**
 * 产品库存评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface DiscusschanpinkucunDao extends BaseMapper<DiscusschanpinkucunEntity> {
	
	List<DiscusschanpinkucunVO> selectListVO(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
	
	DiscusschanpinkucunVO selectVO(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
	
	List<DiscusschanpinkucunView> selectListView(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);

	List<DiscusschanpinkucunView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
	
	DiscusschanpinkucunView selectView(@Param("ew") Wrapper<DiscusschanpinkucunEntity> wrapper);
	
}
