package com.dao;

import com.entity.MeizhuangfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeizhuangfenxiangVO;
import com.entity.view.MeizhuangfenxiangView;


/**
 * 美妆分享
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface MeizhuangfenxiangDao extends BaseMapper<MeizhuangfenxiangEntity> {
	
	List<MeizhuangfenxiangVO> selectListVO(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);
	
	MeizhuangfenxiangVO selectVO(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);
	
	List<MeizhuangfenxiangView> selectListView(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);

	List<MeizhuangfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);

	
	MeizhuangfenxiangView selectView(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);
	

}
