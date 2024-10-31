package com.dao;

import com.entity.ChanpingoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpingoumaiVO;
import com.entity.view.ChanpingoumaiView;


/**
 * 产品购买
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpingoumaiDao extends BaseMapper<ChanpingoumaiEntity> {
	
	List<ChanpingoumaiVO> selectListVO(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
	
	ChanpingoumaiVO selectVO(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
	
	List<ChanpingoumaiView> selectListView(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);

	List<ChanpingoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
	
	ChanpingoumaiView selectView(@Param("ew") Wrapper<ChanpingoumaiEntity> wrapper);
	
}
