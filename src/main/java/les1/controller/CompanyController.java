package les1.controller;

import les1.company.ITCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/*")
public class CompanyController {
    @Autowired
    ITCompany company;

    @GetMapping
    public ITCompany getCompany(){
        return company;
    }
}
