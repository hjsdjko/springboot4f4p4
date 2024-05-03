package com.entity.view;

import com.entity.JiajuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 家具类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
@TableName("jiajuleixing")
public class JiajuleixingView  extends JiajuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiajuleixingView(){
	}
 
 	public JiajuleixingView(JiajuleixingEntity jiajuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, jiajuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
