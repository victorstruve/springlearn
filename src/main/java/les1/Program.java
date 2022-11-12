package les1;

import les1.company.ITCompany;
import les1.config.CompanyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@SpringBootApplication
public class Program {
    public static void main(String[] args){
        SpringApplication.run(Program.class, args);

    }
}