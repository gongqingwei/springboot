package cn.no7player;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@MapperScan("cn.no7player.mapper")
@EnableSwagger2
public class Application {
    private static Logger logger = Logger.getLogger(Application.class);

    /**
     * Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("SpringBoot Start Success");
    }

}
