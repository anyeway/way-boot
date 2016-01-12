# way-boot
spring boot learn

框架特点：

1：创建独立的spring应用。

2：嵌入Tomcat, Jetty Undertow 而且不需要部署他们。

3：提供的“starters”poms来简化Maven配置 (starter poms)

4：尽可能自动配置spring应用。

5：提供生产指标,健壮检查和外部化配置

6：绝对没有代码生成和XML配置要求

约定结构
com
 +- example
     +- myproject
         +- Application.java//main方法所在类在最底层
         |
         +- bean            //bean类
         |   +- Customer.java
         |   +- CustomerRepository.java
         |
         +- service         //service层
         |   +- CustomerService.java
         |
         +- web             //controller层
             +- CustomerController.java
      这样@EnableAutoConfiguration
      可以从逐层的往下搜索各个加注解的类，例如，你正在编写一个JPA程序（如果你的pom里进行了配置的话），spring会自动去搜索加了@Entity注解的类，并进行调用。