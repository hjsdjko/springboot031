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


import com.dao.DiscussmeizhuangfenxiangDao;
import com.entity.DiscussmeizhuangfenxiangEntity;
import com.service.DiscussmeizhuangfenxiangService;
import com.entity.vo.DiscussmeizhuangfenxiangVO;
import com.entity.view.DiscussmeizhuangfenxiangView;

@Service("discussmeizhuangfenxiangService")
public class DiscussmeizhuangfenxiangServiceImpl extends ServiceImpl<DiscussmeizhuangfenxiangDao, DiscussmeizhuangfenxiangEntity> implements DiscussmeizhuangfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeizhuangfenxiangEntity> page = this.selectPage(
                new Query<DiscussmeizhuangfenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscussmeizhuangfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeizhuangfenxiangEntity> wrapper) {
		  Page<DiscussmeizhuangfenxiangView> page =new Query<DiscussmeizhuangfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<DiscussmeizhuangfenxiangVO> selectListVO(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeizhuangfenxiangVO selectVO(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeizhuangfenxiangView> selectListView(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeizhuangfenxiangView selectView(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
