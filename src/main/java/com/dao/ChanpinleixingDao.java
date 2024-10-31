package com.dao;

import com.entity.ChanpinleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinleixingVO;
import com.entity.view.ChanpinleixingView;


/**
 * 产品类型
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinleixingDao extends BaseMapper<ChanpinleixingEntity> {
	
	List<ChanpinleixingVO> selectListVO(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	
	ChanpinleixingVO selectVO(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	
	List<ChanpinleixingView> selectListView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);

	List<ChanpinleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	
	ChanpinleixingView selectView(@Param("ew") Wrapper<ChanpinleixingEntity> wrapper);
	
}
