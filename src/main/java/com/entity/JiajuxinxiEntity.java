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
 * 家具信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
@TableName("jiajuxinxi")
public class JiajuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiajuxinxiEntity() {
		
	}
	
	public JiajuxinxiEntity(T t) {
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
	@TableId
	private Long id;
	/**
	 * 家具名称
	 */
					
	private String jiajumingcheng;
	
	/**
	 * 家具类型
	 */
					
	private String jiajuleixing;
	
	/**
	 * 家具品牌
	 */
					
	private String jiajupinpai;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 家具风格
	 */
					
	private String jiajufengge;
	
	/**
	 * 规格
	 */
					
	private String guige;
	
	/**
	 * 重量
	 */
					
	private String zhongliang;
	
	/**
	 * 家具详情
	 */
					
	private String jiajuxiangqing;
	
	/**
	 * 商家账号
	 */
					
	private String shangjiazhanghao;
	
	/**
	 * 店铺名称
	 */
					
	private String dianpumingcheng;
	
	/**
	 * 店铺地址
	 */
					
	private String dianpudizhi;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：家具名称
	 */
	public void setJiajumingcheng(String jiajumingcheng) {
		this.jiajumingcheng = jiajumingcheng;
	}
	/**
	 * 获取：家具名称
	 */
	public String getJiajumingcheng() {
		return jiajumingcheng;
	}
	/**
	 * 设置：家具类型
	 */
	public void setJiajuleixing(String jiajuleixing) {
		this.jiajuleixing = jiajuleixing;
	}
	/**
	 * 获取：家具类型
	 */
	public String getJiajuleixing() {
		return jiajuleixing;
	}
	/**
	 * 设置：家具品牌
	 */
	public void setJiajupinpai(String jiajupinpai) {
		this.jiajupinpai = jiajupinpai;
	}
	/**
	 * 获取：家具品牌
	 */
	public String getJiajupinpai() {
		return jiajupinpai;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：家具风格
	 */
	public void setJiajufengge(String jiajufengge) {
		this.jiajufengge = jiajufengge;
	}
	/**
	 * 获取：家具风格
	 */
	public String getJiajufengge() {
		return jiajufengge;
	}
	/**
	 * 设置：规格
	 */
	public void setGuige(String guige) {
		this.guige = guige;
	}
	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}
	/**
	 * 设置：重量
	 */
	public void setZhongliang(String zhongliang) {
		this.zhongliang = zhongliang;
	}
	/**
	 * 获取：重量
	 */
	public String getZhongliang() {
		return zhongliang;
	}
	/**
	 * 设置：家具详情
	 */
	public void setJiajuxiangqing(String jiajuxiangqing) {
		this.jiajuxiangqing = jiajuxiangqing;
	}
	/**
	 * 获取：家具详情
	 */
	public String getJiajuxiangqing() {
		return jiajuxiangqing;
	}
	/**
	 * 设置：商家账号
	 */
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
	/**
	 * 设置：店铺名称
	 */
	public void setDianpumingcheng(String dianpumingcheng) {
		this.dianpumingcheng = dianpumingcheng;
	}
	/**
	 * 获取：店铺名称
	 */
	public String getDianpumingcheng() {
		return dianpumingcheng;
	}
	/**
	 * 设置：店铺地址
	 */
	public void setDianpudizhi(String dianpudizhi) {
		this.dianpudizhi = dianpudizhi;
	}
	/**
	 * 获取：店铺地址
	 */
	public String getDianpudizhi() {
		return dianpudizhi;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
