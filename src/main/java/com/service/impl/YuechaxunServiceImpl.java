package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YuechaxunDao;
import com.entity.YuechaxunEntity;
import com.service.YuechaxunService;
import com.entity.vo.YuechaxunVO;
import com.entity.view.YuechaxunView;

@Service("yuechaxunService")
public class YuechaxunServiceImpl extends ServiceImpl<YuechaxunDao, YuechaxunEntity> implements YuechaxunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuechaxunEntity> page = this.selectPage(
                new Query<YuechaxunEntity>(params).getPage(),
                new EntityWrapper<YuechaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuechaxunEntity> wrapper) {
		  Page<YuechaxunView> page =new Query<YuechaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuechaxunVO> selectListVO(Wrapper<YuechaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuechaxunVO selectVO(Wrapper<YuechaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuechaxunView> selectListView(Wrapper<YuechaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuechaxunView selectView(Wrapper<YuechaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
