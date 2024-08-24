package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.JinhuoxinxiEntity;
import com.entity.view.JinhuoxinxiView;

import com.service.JinhuoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 进货信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
@RestController
@RequestMapping("/jinhuoxinxi")
public class JinhuoxinxiController {
    @Autowired
    private JinhuoxinxiService jinhuoxinxiService;




    



    /**
     * 后台列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JinhuoxinxiEntity jinhuoxinxi,
		HttpServletRequest request){
        EntityWrapper<JinhuoxinxiEntity> ew = new EntityWrapper<JinhuoxinxiEntity>();

		PageUtils page = jinhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jinhuoxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前台列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JinhuoxinxiEntity jinhuoxinxi, 
		HttpServletRequest request){
        EntityWrapper<JinhuoxinxiEntity> ew = new EntityWrapper<JinhuoxinxiEntity>();

		PageUtils page = jinhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jinhuoxinxi), params), params));
        return R.ok().put("data", page);
    }



	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JinhuoxinxiEntity jinhuoxinxi){
       	EntityWrapper<JinhuoxinxiEntity> ew = new EntityWrapper<JinhuoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jinhuoxinxi, "jinhuoxinxi")); 
        return R.ok().put("data", jinhuoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JinhuoxinxiEntity jinhuoxinxi){
        EntityWrapper< JinhuoxinxiEntity> ew = new EntityWrapper< JinhuoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jinhuoxinxi, "jinhuoxinxi")); 
		JinhuoxinxiView jinhuoxinxiView =  jinhuoxinxiService.selectView(ew);
		return R.ok("查询进货信息成功").put("data", jinhuoxinxiView);
    }
	
    /**
     * 后台详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JinhuoxinxiEntity jinhuoxinxi = jinhuoxinxiService.selectById(id);
        return R.ok().put("data", jinhuoxinxi);
    }

    /**
     * 前台详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JinhuoxinxiEntity jinhuoxinxi = jinhuoxinxiService.selectById(id);
        return R.ok().put("data", jinhuoxinxi);
    }
    



    /**
     * 后台保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JinhuoxinxiEntity jinhuoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jinhuoxinxi);
        jinhuoxinxiService.insert(jinhuoxinxi);
        return R.ok();
    }
    
    /**
     * 前台保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JinhuoxinxiEntity jinhuoxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(jinhuoxinxi);
        jinhuoxinxiService.insert(jinhuoxinxi);
        return R.ok();
    }





    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JinhuoxinxiEntity jinhuoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jinhuoxinxi);
        jinhuoxinxiService.updateById(jinhuoxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jinhuoxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
