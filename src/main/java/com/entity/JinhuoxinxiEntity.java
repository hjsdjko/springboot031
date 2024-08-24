package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 进货信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
@TableName("jinhuoxinxi")
public class JinhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JinhuoxinxiEntity() {
		
	}
	
	public JinhuoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 美妆分类
	 */
					
	private String meizhuangfenlei;
	
	/**
	 * 进货数量
	 */
					
	private Integer alllimittimes;
	
	/**
	 * 进货时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jinhuoshijian;
	
	/**
	 * 供应商
	 */
					
	private String gongyingshang;
	
	/**
	 * 进货内容
	 */
					
	private String jinhuoneirong;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
	}
	/**
	 * 设置：美妆分类
	 */
	public void setMeizhuangfenlei(String meizhuangfenlei) {
		this.meizhuangfenlei = meizhuangfenlei;
	}
	/**
	 * 获取：美妆分类
	 */
	public String getMeizhuangfenlei() {
		return meizhuangfenlei;
	}
	/**
	 * 设置：进货数量
	 */
	public void setAlllimittimes(Integer alllimittimes) {
		this.alllimittimes = alllimittimes;
	}
	/**
	 * 获取：进货数量
	 */
	public Integer getAlllimittimes() {
		return alllimittimes;
	}
	/**
	 * 设置：进货时间
	 */
	public void setJinhuoshijian(Date jinhuoshijian) {
		this.jinhuoshijian = jinhuoshijian;
	}
	/**
	 * 获取：进货时间
	 */
	public Date getJinhuoshijian() {
		return jinhuoshijian;
	}
	/**
	 * 设置：供应商
	 */
	public void setGongyingshang(String gongyingshang) {
		this.gongyingshang = gongyingshang;
	}
	/**
	 * 获取：供应商
	 */
	public String getGongyingshang() {
		return gongyingshang;
	}
	/**
	 * 设置：进货内容
	 */
	public void setJinhuoneirong(String jinhuoneirong) {
		this.jinhuoneirong = jinhuoneirong;
	}
	/**
	 * 获取：进货内容
	 */
	public String getJinhuoneirong() {
		return jinhuoneirong;
	}

}
