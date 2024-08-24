package com.dao;

import com.entity.MeizhuangfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeizhuangfenleiVO;
import com.entity.view.MeizhuangfenleiView;


/**
 * 美妆分类
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface MeizhuangfenleiDao extends BaseMapper<MeizhuangfenleiEntity> {
	
	List<MeizhuangfenleiVO> selectListVO(@Param("ew") Wrapper<MeizhuangfenleiEntity> wrapper);
	
	MeizhuangfenleiVO selectVO(@Param("ew") Wrapper<MeizhuangfenleiEntity> wrapper);
	
	List<MeizhuangfenleiView> selectListView(@Param("ew") Wrapper<MeizhuangfenleiEntity> wrapper);

	List<MeizhuangfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<MeizhuangfenleiEntity> wrapper);

	
	MeizhuangfenleiView selectView(@Param("ew") Wrapper<MeizhuangfenleiEntity> wrapper);
	

}
