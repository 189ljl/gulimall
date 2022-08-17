package com.ljlgithub.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ljlgithub.common.utils.PageUtils;
import com.ljlgithub.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.ljlgithub.gulimall.product.dao.CategoryDao;
import com.ljlgithub.gulimall.product.entity.CategoryEntity;
import com.ljlgithub.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        //1.查询所有分类，可以避免频繁查询数据库，提高系统性能
        List<CategoryEntity> allCategoies = this.list();
        //2. 以树形结构返回所有分类
        List<CategoryEntity> level1Category = allCategoies.stream()
                // 2.1 过滤出所有一级分类 lambda表达式语法：当参数只有一个时可以省略括号  由于方法体只有一条语句，大括号可以省
                .filter(categoryEntity -> categoryEntity.getCatLevel() == 1)
                // 2.2 递归查找出分类的子分类并进行赋值
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrenCategory(categoryEntity, allCategoies));
                    return categoryEntity;
                })
                .sorted((category1, category2) -> {
                    return category1.getSort() - category2.getSort();
                })
                .collect(Collectors.toList());
        return level1Category;
    }

    //查询某个分类下子分类 递归完成所有分类
    private List<CategoryEntity> getChildrenCategory(CategoryEntity root, List<CategoryEntity> allCategoies) {
        List<CategoryEntity> childrenCategoryList = allCategoies.stream()
                .filter(categoryEntity -> root.getCatId().equals(categoryEntity.getParentCid()))
                //对每个元素进行操作
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildrenCategory(categoryEntity, allCategoies));
                    return categoryEntity;
                })
                //默认按照升序排列，需要注意获取的属性Integer有可能为null，不能参与运算
                .sorted((category1, category2) -> {
                    return category1.getSort() == null ? 0 : category1.getSort() - category2.getSort();
                })
                //收集
                .collect(Collectors.toList());
        return childrenCategoryList;
    }
}