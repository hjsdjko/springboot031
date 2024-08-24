package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeizhuangchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeizhuangchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeizhuangchanpinView;


/**
 * 美妆产品
 *
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface MeizhuangchanpinService extends IService<MeizhuangchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeizhuangchanpinVO> selectListVO(Wrapper<MeizhuangchanpinEntity> wrapper);
   	
   	MeizhuangchanpinVO selectVO(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);
   	
   	List<MeizhuangchanpinView> selectListView(Wrapper<MeizhuangchanpinEntity> wrapper);
   	
   	MeizhuangchanpinView selectView(@Param("ew") Wrapper<MeizhuangchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeizhuangchanpinEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<MeizhuangchanpinEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<MeizhuangchanpinEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<MeizhuangchanpinEntity> wrapper);



}

