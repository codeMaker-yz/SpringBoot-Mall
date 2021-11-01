# SpringBoot-Mall
商城项目学习

## 环境

- SpringBoot 2.3.4.RELEASE
- SpringCloud Hoxton.SR10

mall-common模块中存放微服务公共的依赖，bean，工具类等

SpringBoot版本要和SpringCloud版本对应

## 配置nacos作为服务注册中心和配置管理

使用nacos作为注册中心

    1. common模块中引入相关依赖
    2. 启动类上添加@EnableDiscoveryClient注解
    3. 配置文件中配置nacos.addr和application.name

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

跨域：浏览器不能执行其他网站的脚步，由浏览器的同源策略造成，是浏览器对js施加的安全策略。

同源策略：协议，域名，端口要全部相同，其中一个不同就不产生跨域。

跨域流程：对于非简单请求，会先发送一个预检OPTIONS请求进行探测，等待服务器响应是否允许跨域，
如果允许，浏览器才能发送真实请求。

解决跨域：

1.使用nginx部署为同一域


2.服务器允许当次请求跨域


mybatis逻辑删除:

配置全局的逻辑删除规则

实体类字段加上@TableLogic注解

使用阿里云oss完成对象存储

1. 引入oss-starter
2. 配置key、endpoint等信息
3. 使用OSSClient进行相关操作


后端校验流程：

给bean添加校验注解，并定义message提示

开启校验功能@Valid，校验错误后会有默认的响应

给校验的bean后紧跟一个BindingResult，



