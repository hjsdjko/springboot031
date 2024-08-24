package com.entity.view;

import com.entity.MeizhuangfenxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 美妆分享
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
@TableName("meizhuangfenxiang")
public class MeizhuangfenxiangView  extends MeizhuangfenxiangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeizhuangfenxiangView(){
	}
 
 	public MeizhuangfenxiangView(MeizhuangfenxiangEntity meizhuangfenxiangEntity){
 	try {
			BeanUtils.copyProperties(this, meizhuangfenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
