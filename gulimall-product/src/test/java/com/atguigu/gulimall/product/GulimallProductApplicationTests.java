package com.atguigu.gulimall.product;


import com.atguigu.gulimall.product.entity.BrandEntity;
import com.atguigu.gulimall.product.service.BrandService;
import com.atguigu.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


/**
 * 1、引入oss-starter
 * 2、配置key、endpoint相关信息
 * 3、使用 OSSClient 进行相关操作
 */
@Slf4j
@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Autowired
    CategoryService categoryService;

    // @Autowired
    // OSSClient ossClient;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("维基多格");
//        brandEntity.setName("vegedog");
//        brandService.save(brandEntity);
//        System.out.println("保存成功");

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((item) -> {
            System.out.println(item);
        });
    }


    @Test
    public void testUpload() throws FileNotFoundException {
//        // Endpoint以杭州为例，其它Region请按实际情况填写。
//        String endpoint = "oss-cn-shenzhen.aliyuncs.com";
//        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建。
//        String accessKeyId = "LTAI4FyE6MULekxSE95PtVvb";
//        String accessKeySecret = "N3STrI7FyvWjYx3TiMiNJZEgXt7ba6";

//        // 创建OSSClient实例。
//        OSS ossClient = new OSSClientBuilder().build(endpoint, accessKeyId, accessKeySecret);

        // 上传文件流。
        //InputStream inputStream = new FileInputStream("G:\\IdeaProjects\\gulimall_document\\pics\\0d40c24b264aa511.jpg");
        //ossClient.putObject("gulimall-vegedog", "0d40c24b264aa511.jpg", inputStream);

        // 关闭OSSClient。
        // ossClient.shutdown();

        System.out.println("上传完成...");
    }


    @Test
    public void testFindPath() {
        Long[] catelogPath = categoryService.findCatelogPath(225L);
        log.info("完整路径:{}", Arrays.asList(catelogPath));

    }
}
