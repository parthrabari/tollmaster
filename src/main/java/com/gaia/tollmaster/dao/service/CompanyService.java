package com.gaia.tollmaster.dao.service;

import com.gaia.tollmaster.dao.models.Company;
import com.gaia.tollmaster.dao.repos.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Parth on 02/07/2017.
 */

@Service
public class CompanyService {

    private CompanyRepository companyRepository;

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company getCompanyDetails(String name){
        return companyRepository.findOne(name);
    }

    public Company addCompany(Company company){
        try{
            companyRepository.save(company);
            return company;
        }
        catch (Exception e){
            return null;
        }
    }

    public void deleteCompany(String name){
        try {
            companyRepository.delete(name);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
