package com.dao;

import com.entity.JinhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JinhuoxinxiVO;
import com.entity.view.JinhuoxinxiView;


/**
 * 进货信息
 * 
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface JinhuoxinxiDao extends BaseMapper<JinhuoxinxiEntity> {
	
	List<JinhuoxinxiVO> selectListVO(@Param("ew") Wrapper<JinhuoxinxiEntity> wrapper);
	
	JinhuoxinxiVO selectVO(@Param("ew") Wrapper<JinhuoxinxiEntity> wrapper);
	
	List<JinhuoxinxiView> selectListView(@Param("ew") Wrapper<JinhuoxinxiEntity> wrapper);

	List<JinhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JinhuoxinxiEntity> wrapper);

	
	JinhuoxinxiView selectView(@Param("ew") Wrapper<JinhuoxinxiEntity> wrapper);
	

}
