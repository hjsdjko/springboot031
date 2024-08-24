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


import com.dao.MeizhuangchanpinDao;
import com.entity.MeizhuangchanpinEntity;
import com.service.MeizhuangchanpinService;
import com.entity.vo.MeizhuangchanpinVO;
import com.entity.view.MeizhuangchanpinView;

@Service("meizhuangchanpinService")
public class MeizhuangchanpinServiceImpl extends ServiceImpl<MeizhuangchanpinDao, MeizhuangchanpinEntity> implements MeizhuangchanpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeizhuangchanpinEntity> page = this.selectPage(
                new Query<MeizhuangchanpinEntity>(params).getPage(),
                new EntityWrapper<MeizhuangchanpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeizhuangchanpinEntity> wrapper) {
		  Page<MeizhuangchanpinView> page =new Query<MeizhuangchanpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<MeizhuangchanpinVO> selectListVO(Wrapper<MeizhuangchanpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeizhuangchanpinVO selectVO(Wrapper<MeizhuangchanpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeizhuangchanpinView> selectListView(Wrapper<MeizhuangchanpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeizhuangchanpinView selectView(Wrapper<MeizhuangchanpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<MeizhuangchanpinEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<MeizhuangchanpinEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<MeizhuangchanpinEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
