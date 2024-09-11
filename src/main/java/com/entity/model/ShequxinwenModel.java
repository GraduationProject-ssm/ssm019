package com.entity.model;

import com.entity.ShequxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 社区新闻
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-02-22 14:03:49
 */
public class ShequxinwenModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 文章来源
	 */
	
	private String wenzhanglaiyuan;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 新闻内容
	 */
	
	private String xinwenneirong;
		
	/**
	 * 新闻图片
	 */
	
	private String xinwentupian;
		
	/**
	 * 发布人
	 */
	
	private String faburen;
				
	
	/**
	 * 设置：文章来源
	 */
	 
	public void setWenzhanglaiyuan(String wenzhanglaiyuan) {
		this.wenzhanglaiyuan = wenzhanglaiyuan;
	}
	
	/**
	 * 获取：文章来源
	 */
	public String getWenzhanglaiyuan() {
		return wenzhanglaiyuan;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：新闻内容
	 */
	 
	public void setXinwenneirong(String xinwenneirong) {
		this.xinwenneirong = xinwenneirong;
	}
	
	/**
	 * 获取：新闻内容
	 */
	public String getXinwenneirong() {
		return xinwenneirong;
	}
				
	
	/**
	 * 设置：新闻图片
	 */
	 
	public void setXinwentupian(String xinwentupian) {
		this.xinwentupian = xinwentupian;
	}
	
	/**
	 * 获取：新闻图片
	 */
	public String getXinwentupian() {
		return xinwentupian;
	}
				
	
	/**
	 * 设置：发布人
	 */
	 
	public void setFaburen(String faburen) {
		this.faburen = faburen;
	}
	
	/**
	 * 获取：发布人
	 */
	public String getFaburen() {
		return faburen;
	}
			
}