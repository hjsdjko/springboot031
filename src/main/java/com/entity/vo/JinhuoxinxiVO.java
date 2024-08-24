package com.entity.vo;

import com.entity.JinhuoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 进货信息
 * @author 
 * @email 
 * @date 2024-04-24 20:58:07
 */
public class JinhuoxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
