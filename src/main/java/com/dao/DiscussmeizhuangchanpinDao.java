package com.dao;

import com.entity.DiscussmeizhuangchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeizhuangchanpinVO;
import com.entity.view.DiscussmeizhuangchanpinView;


/**
 * 美妆产品评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:08
 */
public interface DiscussmeizhuangchanpinDao extends BaseMapper<DiscussmeizhuangchanpinEntity> {
	
	List<DiscussmeizhuangchanpinVO> selectListVO(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
	
	DiscussmeizhuangchanpinVO selectVO(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
	
	List<DiscussmeizhuangchanpinView> selectListView(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);

	List<DiscussmeizhuangchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);

	
	DiscussmeizhuangchanpinView selectView(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
	

}
