package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeizhuangchanpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeizhuangchanpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeizhuangchanpinView;


/**
 * 美妆产品评论表
 *
 * @author 
 * @email 
 * @date 2024-04-24 20:58:08
 */
public interface DiscussmeizhuangchanpinService extends IService<DiscussmeizhuangchanpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeizhuangchanpinVO> selectListVO(Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
   	
   	DiscussmeizhuangchanpinVO selectVO(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
   	
   	List<DiscussmeizhuangchanpinView> selectListView(Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
   	
   	DiscussmeizhuangchanpinView selectView(@Param("ew") Wrapper<DiscussmeizhuangchanpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeizhuangchanpinEntity> wrapper);

   	

}

