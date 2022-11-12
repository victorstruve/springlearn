package les1.config;


import les1.company.ITCompany;
import les1.company.employer.Employer;
import les1.company.employer.ITRole;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("les1.company")
public class CompanyConfig {

    @Bean
    @Primary
    public ITCompany getITCompany(Employer<ITRole> director){
        ITCompany company = new ITCompany("Sber",100);
        company.setDirector(director);
        return  company;
    }
    @Bean
    public ITCompany gerAnotherITCompany(){
        return new ITCompany("NoName",200);
    }
    @Bean
    public Employer<ITRole> getDirector(){
        return new Employer<ITRole>("Oleg", 30, ITRole.Director){
            @Override
            public void work(){
                System.out.println(this.getName()+"is directing");
            }
        };
    }
    @Bean("CompanyName")
    public String getCompanyName(){
        return "Sber";
    }
    @Bean("MaxEmployerCount")
    public int getCount(){
        return 100;
    }
}