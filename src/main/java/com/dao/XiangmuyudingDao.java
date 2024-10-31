package com.dao;

import com.entity.XiangmuyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuyudingVO;
import com.entity.view.XiangmuyudingView;


/**
 * 项目预定
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface XiangmuyudingDao extends BaseMapper<XiangmuyudingEntity> {
	
	List<XiangmuyudingVO> selectListVO(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
	
	XiangmuyudingVO selectVO(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
	
	List<XiangmuyudingView> selectListView(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);

	List<XiangmuyudingView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
	
	XiangmuyudingView selectView(@Param("ew") Wrapper<XiangmuyudingEntity> wrapper);
	
}
