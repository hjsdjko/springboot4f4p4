package com.dao;

import com.entity.DiscussjiajuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiajuxinxiVO;
import com.entity.view.DiscussjiajuxinxiView;


/**
 * 家具信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-27 17:11:41
 */
public interface DiscussjiajuxinxiDao extends BaseMapper<DiscussjiajuxinxiEntity> {
	
	List<DiscussjiajuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
	
	DiscussjiajuxinxiVO selectVO(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
	
	List<DiscussjiajuxinxiView> selectListView(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);

	List<DiscussjiajuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
	
	DiscussjiajuxinxiView selectView(@Param("ew") Wrapper<DiscussjiajuxinxiEntity> wrapper);
	
}
