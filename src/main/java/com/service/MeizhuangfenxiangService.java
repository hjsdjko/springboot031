package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeizhuangfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeizhuangfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeizhuangfenxiangView;


/**
 * 美妆分享
 *
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public interface MeizhuangfenxiangService extends IService<MeizhuangfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeizhuangfenxiangVO> selectListVO(Wrapper<MeizhuangfenxiangEntity> wrapper);
   	
   	MeizhuangfenxiangVO selectVO(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);
   	
   	List<MeizhuangfenxiangView> selectListView(Wrapper<MeizhuangfenxiangEntity> wrapper);
   	
   	MeizhuangfenxiangView selectView(@Param("ew") Wrapper<MeizhuangfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeizhuangfenxiangEntity> wrapper);

   	

}

