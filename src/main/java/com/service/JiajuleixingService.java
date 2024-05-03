package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiajuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiajuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiajuleixingView;


/**
 * 家具类型
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
public interface JiajuleixingService extends IService<JiajuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiajuleixingVO> selectListVO(Wrapper<JiajuleixingEntity> wrapper);
   	
   	JiajuleixingVO selectVO(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
   	
   	List<JiajuleixingView> selectListView(Wrapper<JiajuleixingEntity> wrapper);
   	
   	JiajuleixingView selectView(@Param("ew") Wrapper<JiajuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiajuleixingEntity> wrapper);
   	
}

