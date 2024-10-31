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


import com.dao.ChanpinkucunDao;
import com.entity.ChanpinkucunEntity;
import com.service.ChanpinkucunService;
import com.entity.vo.ChanpinkucunVO;
import com.entity.view.ChanpinkucunView;

@Service("chanpinkucunService")
public class ChanpinkucunServiceImpl extends ServiceImpl<ChanpinkucunDao, ChanpinkucunEntity> implements ChanpinkucunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpinkucunEntity> page = this.selectPage(
                new Query<ChanpinkucunEntity>(params).getPage(),
                new EntityWrapper<ChanpinkucunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpinkucunEntity> wrapper) {
		  Page<ChanpinkucunView> page =new Query<ChanpinkucunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpinkucunVO> selectListVO(Wrapper<ChanpinkucunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpinkucunVO selectVO(Wrapper<ChanpinkucunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpinkucunView> selectListView(Wrapper<ChanpinkucunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpinkucunView selectView(Wrapper<ChanpinkucunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
