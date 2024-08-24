package com.dao;

import com.entity.MeizhuangchanpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeizhuangchanpinVO;
import com.entity.view.MeizhuangchanpinView;


/**
 * 美妆产品
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface MeizhuangchanpinDao extends BaseMapper<MeizhuangchanpinEntity> {
	
	List<MeizhuangchanpinVO> selectListVO(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);
	
	MeizhuangchanpinVO selectVO(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);
	
	List<MeizhuangchanpinView> selectListView(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);

	List<MeizhuangchanpinView> selectListView(Pagination page,@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);

	
	MeizhuangchanpinView selectView(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);



}
