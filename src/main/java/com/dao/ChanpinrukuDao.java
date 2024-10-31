package com.dao;

import com.entity.ChanpinrukuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChanpinrukuVO;
import com.entity.view.ChanpinrukuView;


/**
 * 产品入库
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface ChanpinrukuDao extends BaseMapper<ChanpinrukuEntity> {
	
	List<ChanpinrukuVO> selectListVO(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
	
	ChanpinrukuVO selectVO(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
	
	List<ChanpinrukuView> selectListView(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);

	List<ChanpinrukuView> selectListView(Pagination page,@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
	
	ChanpinrukuView selectView(@Param("ew") Wrapper<ChanpinrukuEntity> wrapper);
	
}
