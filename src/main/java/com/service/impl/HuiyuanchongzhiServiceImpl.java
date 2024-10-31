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


import com.dao.HuiyuanchongzhiDao;
import com.entity.HuiyuanchongzhiEntity;
import com.service.HuiyuanchongzhiService;
import com.entity.vo.HuiyuanchongzhiVO;
import com.entity.view.HuiyuanchongzhiView;

@Service("huiyuanchongzhiService")
public class HuiyuanchongzhiServiceImpl extends ServiceImpl<HuiyuanchongzhiDao, HuiyuanchongzhiEntity> implements HuiyuanchongzhiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanchongzhiEntity> page = this.selectPage(
                new Query<HuiyuanchongzhiEntity>(params).getPage(),
                new EntityWrapper<HuiyuanchongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanchongzhiEntity> wrapper) {
		  Page<HuiyuanchongzhiView> page =new Query<HuiyuanchongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanchongzhiVO> selectListVO(Wrapper<HuiyuanchongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanchongzhiVO selectVO(Wrapper<HuiyuanchongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanchongzhiView> selectListView(Wrapper<HuiyuanchongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanchongzhiView selectView(Wrapper<HuiyuanchongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
