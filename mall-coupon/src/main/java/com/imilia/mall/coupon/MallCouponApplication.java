package com.imilia.mall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
    使用nacos作为配置中心统一管理配置
    1.引入依赖
    2.创建一个bootstrap.properties
    3.配置中心默认添加一个 数据集(Data Id) mall-coupon.properties, 默认规则，在properties中添加配置信息
    4.动态获取配置，@RefreshScope注解,动态获取并刷新配置
                 @Value("${配置项的名}")
                 配置中心中的配置优先使用

    细节：
    1.命名空间：配置隔离：
        默认：public（保留空间），默认新增的所有配置都在public空间
        可以新增prop，test，dev命名环境，在利用命名空间进行环境隔离
        在bootstrap配置文件中选择要使用的环境:spring.cloud.nacos.config.namespace=
        每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有配置

    2.配置集：所有配置的集合

    3.配置集ID:类似文件名

    4.配置分组：
        默认所有配置集都属于：DEFAULT_GROUP
        spring.cloud.nacos.config.group=配置分组

    每个微服务创建自己的命名空间，使用配置分组区分环境：dev，test，prop

    同时加载多个配置集
    spring.cloud.nacos.config.extension-configs[0].data-id =
    spring.cloud.nacos.config.extension-configs[0].group =
    spring.cloud.nacos.config.extension-configs[0].refresh =
 */

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.imilia.mall.coupon.dao")
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
