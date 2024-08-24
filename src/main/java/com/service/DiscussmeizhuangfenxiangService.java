package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeizhuangfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeizhuangfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeizhuangfenxiangView;


/**
 * 美妆分享评论表
 *
 * @author 
 * @email 
 * @date 2024-04-24 20:58:08
 */
public interface DiscussmeizhuangfenxiangService extends IService<DiscussmeizhuangfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeizhuangfenxiangVO> selectListVO(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
   	
   	DiscussmeizhuangfenxiangVO selectVO(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
   	
   	List<DiscussmeizhuangfenxiangView> selectListView(Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
   	
   	DiscussmeizhuangfenxiangView selectView(@Param("ew") Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeizhuangfenxiangEntity> wrapper);

   	

}

