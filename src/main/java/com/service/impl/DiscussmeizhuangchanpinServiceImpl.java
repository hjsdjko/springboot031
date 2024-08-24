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


import com.dao.DiscussmeizhuangchanpinDao;
import com.entity.DiscussmeizhuangchanpinEntity;
import com.service.DiscussmeizhuangchanpinService;
import com.entity.vo.DiscussmeizhuangchanpinVO;
import com.entity.view.DiscussmeizhuangchanpinView;

@Service("discussmeizhuangchanpinService")
public class DiscussmeizhuangchanpinServiceImpl extends ServiceImpl<DiscussmeizhuangchanpinDao, DiscussmeizhuangchanpinEntity> implements DiscussmeizhuangchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeizhuangchanpinEntity> page = this.selectPage(
                new Query<DiscussmeizhuangchanpinEntity>(params).getPage(),
                new EntityWrapper<DiscussmeizhuangchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeizhuangchanpinEntity> wrapper) {
		  Page<DiscussmeizhuangchanpinView> page =new Query<DiscussmeizhuangchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussmeizhuangchanpinVO> selectListVO(Wrapper<DiscussmeizhuangchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeizhuangchanpinVO selectVO(Wrapper<DiscussmeizhuangchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeizhuangchanpinView> selectListView(Wrapper<DiscussmeizhuangchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeizhuangchanpinView selectView(Wrapper<DiscussmeizhuangchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
