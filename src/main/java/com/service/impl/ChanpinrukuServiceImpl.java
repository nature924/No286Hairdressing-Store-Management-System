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


import com.dao.ChanpinrukuDao;
import com.entity.ChanpinrukuEntity;
import com.service.ChanpinrukuService;
import com.entity.vo.ChanpinrukuVO;
import com.entity.view.ChanpinrukuView;

@Service("chanpinrukuService")
public class ChanpinrukuServiceImpl extends ServiceImpl<ChanpinrukuDao, ChanpinrukuEntity> implements ChanpinrukuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinrukuEntity> page = this.selectPage(
                new Query<ChanpinrukuEntity>(params).getPage(),
                new EntityWrapper<ChanpinrukuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinrukuEntity> wrapper) {
		  Page<ChanpinrukuView> page =new Query<ChanpinrukuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinrukuVO> selectListVO(Wrapper<ChanpinrukuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinrukuVO selectVO(Wrapper<ChanpinrukuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinrukuView> selectListView(Wrapper<ChanpinrukuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinrukuView selectView(Wrapper<ChanpinrukuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
