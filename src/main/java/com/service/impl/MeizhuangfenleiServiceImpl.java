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


import com.dao.MeizhuangfenleiDao;
import com.entity.MeizhuangfenleiEntity;
import com.service.MeizhuangfenleiService;
import com.entity.vo.MeizhuangfenleiVO;
import com.entity.view.MeizhuangfenleiView;

@Service("meizhuangfenleiService")
public class MeizhuangfenleiServiceImpl extends ServiceImpl<MeizhuangfenleiDao, MeizhuangfenleiEntity> implements MeizhuangfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeizhuangfenleiEntity> page = this.selectPage(
                new Query<MeizhuangfenleiEntity>(params).getPage(),
                new EntityWrapper<MeizhuangfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeizhuangfenleiEntity> wrapper) {
		  Page<MeizhuangfenleiView> page =new Query<MeizhuangfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<MeizhuangfenleiVO> selectListVO(Wrapper<MeizhuangfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeizhuangfenleiVO selectVO(Wrapper<MeizhuangfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeizhuangfenleiView> selectListView(Wrapper<MeizhuangfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeizhuangfenleiView selectView(Wrapper<MeizhuangfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
