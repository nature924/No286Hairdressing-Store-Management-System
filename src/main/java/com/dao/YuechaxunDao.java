package com.dao;

import com.entity.YuechaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuechaxunVO;
import com.entity.view.YuechaxunView;


/**
 * 余额查询
 * 
 * @author 
 * @email 
 * @date 2021-04-17 11:52:25
 */
public interface YuechaxunDao extends BaseMapper<YuechaxunEntity> {
	
	List<YuechaxunVO> selectListVO(@Param("ew") Wrapper<YuechaxunEntity> wrapper);
	
	YuechaxunVO selectVO(@Param("ew") Wrapper<YuechaxunEntity> wrapper);
	
	List<YuechaxunView> selectListView(@Param("ew") Wrapper<YuechaxunEntity> wrapper);

	List<YuechaxunView> selectListView(Pagination page,@Param("ew") Wrapper<YuechaxunEntity> wrapper);
	
	YuechaxunView selectView(@Param("ew") Wrapper<YuechaxunEntity> wrapper);
	
}
