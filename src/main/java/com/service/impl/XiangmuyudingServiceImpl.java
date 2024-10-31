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


import com.dao.XiangmuyudingDao;
import com.entity.XiangmuyudingEntity;
import com.service.XiangmuyudingService;
import com.entity.vo.XiangmuyudingVO;
import com.entity.view.XiangmuyudingView;

@Service("xiangmuyudingService")
public class XiangmuyudingServiceImpl extends ServiceImpl<XiangmuyudingDao, XiangmuyudingEntity> implements XiangmuyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuyudingEntity> page = this.selectPage(
                new Query<XiangmuyudingEntity>(params).getPage(),
                new EntityWrapper<XiangmuyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuyudingEntity> wrapper) {
		  Page<XiangmuyudingView> page =new Query<XiangmuyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuyudingVO> selectListVO(Wrapper<XiangmuyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuyudingVO selectVO(Wrapper<XiangmuyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuyudingView> selectListView(Wrapper<XiangmuyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuyudingView selectView(Wrapper<XiangmuyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
