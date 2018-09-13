package cc.ryanc.halo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;

/**
 * <pre>
 *     Halo run!
 * </pre>
 *
 * @author : RYAN0UP
 * @date : 2017/11/14
 */
@Slf4j
@SpringBootApplication
@EnableCaching
public class Application {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        String serverPort = context.getEnvironment().getProperty("server.port");
        //Log4j找不到log  https://www.jianshu.com/p/d456b420d7d7 在项目中使用Lombok可以减少很多重复代码的书写
        log.info("Shiming Demo  Halo started at http://localhost:" + serverPort);
    }
}
