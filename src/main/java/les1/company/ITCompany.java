package les1.company;

import les1.company.employer.Employer;
import les1.company.employer.ITRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Objects;
@Component("CompanyComponent")
public class ITCompany extends EntityManager<Employer> {
    @Value("Sber")
    private String name;

    @Autowired
    private Employer<ITRole> director;

//    public ITCompany(){
//        super(100, Employer.class);
//    }

    public ITCompany(@Qualifier("CompanyName") String companyName,
                     @Qualifier("MaxEmployerCount") int maxEmployerCount){
        super(maxEmployerCount, Employer.class);
        this.name = companyName;
    }


    public void startWork(){
        for (int i = 0; i< this.getSize(); i++){
            Employer[] workers = this.getEntities();
            Employer worker = workers[i];
            worker.work();
            System.out.println(worker.getName() + " is "+ worker.getRole());
        }
    }

    public String getName(){return name;}

    public Employer<ITRole> getDirector() {
        return director;
    }

    public void  setDirector(Employer<ITRole> director){
        this.director = director;
    }

    @Override
    public String toString(){
        return "ITCompany{"+"name='"+name+'\''+'}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return  false;
        ITCompany company = (ITCompany) o;
        return  Objects.equals(name, company.name);
    }

    @Override
    public int hashCode(){return Objects.hash(name);}
}
