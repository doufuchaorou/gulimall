package com.atguigu.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用Nacos作为配置中心统一管理配置
 * 1、引入依赖
 * 2、创建bootstrap.properties
 * 3、在配置中心里默认添加一个数据集(Data Id) 默认规则：应用名.properties
 * 4、给应用名.properties添加任何配置
 * 5、动态获取配置
 *      @Refresh-动态获取并刷新配置  @Value("${配置项名}")获取到配置
 *
 * 如果配置中心和当前应用的配置文件都配置了相同的项，优先使用配置中心的配置
 *
 * 细节：
 * 1、命名空间：空间隔离
 *      默认 public(保留空间)：默认新增的所有配置都在public空间
 *      1）开发、测试、生产：利用命名空间来做环境隔离
 *          注意：在bootstrap.properties配置上，需要使用哪个命名空间下的配置
 *          spring.cloud.nacos.config.namespace=2a6de6d1-6c3f-445e-93e5-30e11b645a72
 *      2）每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置
 * 2、配置集
 *      所有的配置的集合
 * 3、配置集ID
 *      类似配置文件名：e.g. Data ID
 * 4、配置分组
 *      默认都属于Default Group
 *          e.g. 1111  618
 * 每个微服务创建自己的命名空间，使用配置分组区分环境，dev,test,prod
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
