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


import com.dao.ChanpingoumaiDao;
import com.entity.ChanpingoumaiEntity;
import com.service.ChanpingoumaiService;
import com.entity.vo.ChanpingoumaiVO;
import com.entity.view.ChanpingoumaiView;

@Service("chanpingoumaiService")
public class ChanpingoumaiServiceImpl extends ServiceImpl<ChanpingoumaiDao, ChanpingoumaiEntity> implements ChanpingoumaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChanpingoumaiEntity> page = this.selectPage(
                new Query<ChanpingoumaiEntity>(params).getPage(),
                new EntityWrapper<ChanpingoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChanpingoumaiEntity> wrapper) {
		  Page<ChanpingoumaiView> page =new Query<ChanpingoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChanpingoumaiVO> selectListVO(Wrapper<ChanpingoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChanpingoumaiVO selectVO(Wrapper<ChanpingoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChanpingoumaiView> selectListView(Wrapper<ChanpingoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChanpingoumaiView selectView(Wrapper<ChanpingoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
