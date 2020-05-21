package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Vegedog
 * @email vegedog@qq.com
 * @date 2020-05-21 22:16:59
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
