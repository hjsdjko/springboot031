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


import com.dao.MeizhuangfenxiangDao;
import com.entity.MeizhuangfenxiangEntity;
import com.service.MeizhuangfenxiangService;
import com.entity.vo.MeizhuangfenxiangVO;
import com.entity.view.MeizhuangfenxiangView;

@Service("meizhuangfenxiangService")
public class MeizhuangfenxiangServiceImpl extends ServiceImpl<MeizhuangfenxiangDao, MeizhuangfenxiangEntity> implements MeizhuangfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeizhuangfenxiangEntity> page = this.selectPage(
                new Query<MeizhuangfenxiangEntity>(params).getPage(),
                new EntityWrapper<MeizhuangfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeizhuangfenxiangEntity> wrapper) {
		  Page<MeizhuangfenxiangView> page =new Query<MeizhuangfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<MeizhuangfenxiangVO> selectListVO(Wrapper<MeizhuangfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeizhuangfenxiangVO selectVO(Wrapper<MeizhuangfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeizhuangfenxiangView> selectListView(Wrapper<MeizhuangfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeizhuangfenxiangView selectView(Wrapper<MeizhuangfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
