package com.ljlgithub.gulimall.product;

import com.ljlgithub.common.utils.R;
import com.ljlgithub.gulimall.product.controller.CategoryController;
import com.ljlgithub.gulimall.product.entity.BrandEntity;
import com.ljlgithub.gulimall.product.service.BrandService;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GulimallProductApplicationTests {

    @Autowired
    CategoryController categoryController;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test() {
        R list = categoryController.list(null);
        Object tree = list.get("tree");
    }

}
