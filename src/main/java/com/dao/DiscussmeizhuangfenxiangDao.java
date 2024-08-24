package com.dao;

import com.entity.DiscussmeizhuangfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeizhuangfenxiangVO;
import com.entity.view.DiscussmeizhuangfenxiangView;


/**
 * 美妆分享评论表
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:08
 */
public interface DiscussmeizhuangfenxiangDao extends BaseMapper<DiscussmeizhuangfenxiangEntity> {
	
	List<DiscussmeizhuangfenxiangVO> selectListVO(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
	
	DiscussmeizhuangfenxiangVO selectVO(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
	
	List<DiscussmeizhuangfenxiangView> selectListView(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);

	List<DiscussmeizhuangfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);

	
	DiscussmeizhuangfenxiangView selectView(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
	

}
