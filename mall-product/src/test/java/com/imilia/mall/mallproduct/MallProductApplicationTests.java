package com.imilia.mall.mallproduct;

import com.imilia.mall.product.MallProductApplication;
import com.imilia.mall.product.entity.BrandEntity;
import com.imilia.mall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MallProductApplication.class)
@RunWith(SpringRunner.class)
class MallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity entity = new BrandEntity();
        BrandEntity brandEntity = brandService.getById(1L);
        System.out.println(brandEntity);
        /*entity.setName("华为");
        brandService.save(entity);
        System.out.println("保存成功。。。");*/
    }

}
