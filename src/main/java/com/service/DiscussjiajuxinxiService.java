package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiajuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiajuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiajuxinxiView;


/**
 * 家具信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
public interface DiscussjiajuxinxiService extends IService<DiscussjiajuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiajuxinxiVO> selectListVO(Wrapper<DiscussjiajuxinxiEntity> wrapper);
   	
   	DiscussjiajuxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
   	
   	List<DiscussjiajuxinxiView> selectListView(Wrapper<DiscussjiajuxinxiEntity> wrapper);
   	
   	DiscussjiajuxinxiView selectView(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiajuxinxiEntity> wrapper);
   	
}

