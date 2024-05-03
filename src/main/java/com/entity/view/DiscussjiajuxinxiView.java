package com.entity.view;

import com.entity.DiscussjiajuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家具信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
@TableName("discussjiajuxinxi")
public class DiscussjiajuxinxiView  extends DiscussjiajuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiajuxinxiView(){
	}
 
 	public DiscussjiajuxinxiView(DiscussjiajuxinxiEntity discussjiajuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiajuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
