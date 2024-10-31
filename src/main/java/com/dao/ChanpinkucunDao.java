package com.dao;

import com.entity.ChanpinkucunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinkucunVO;
import com.entity.view.ChanpinkucunView;


/**
 * 产品库存
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinkucunDao extends BaseMapper<ChanpinkucunEntity> {
	
	List<ChanpinkucunVO> selectListVO(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
	ChanpinkucunVO selectVO(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
	List<ChanpinkucunView> selectListView(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);

	List<ChanpinkucunView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
	ChanpinkucunView selectView(@Param("ew") Wrapper<ChanpinkucunEntity> wrapper);
	
}
