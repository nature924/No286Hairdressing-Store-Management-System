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


import com.dao.DiscusschanpinkucunDao;
import com.entity.DiscusschanpinkucunEntity;
import com.service.DiscusschanpinkucunService;
import com.entity.vo.DiscusschanpinkucunVO;
import com.entity.view.DiscusschanpinkucunView;

@Service("discusschanpinkucunService")
public class DiscusschanpinkucunServiceImpl extends ServiceImpl<DiscusschanpinkucunDao, DiscusschanpinkucunEntity> implements DiscusschanpinkucunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusschanpinkucunEntity> page = this.selectPage(
                new Query<DiscusschanpinkucunEntity>(params).getPage(),
                new EntityWrapper<DiscusschanpinkucunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusschanpinkucunEntity> wrapper) {
		  Page<DiscusschanpinkucunView> page =new Query<DiscusschanpinkucunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusschanpinkucunVO> selectListVO(Wrapper<DiscusschanpinkucunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusschanpinkucunVO selectVO(Wrapper<DiscusschanpinkucunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusschanpinkucunView> selectListView(Wrapper<DiscusschanpinkucunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusschanpinkucunView selectView(Wrapper<DiscusschanpinkucunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
